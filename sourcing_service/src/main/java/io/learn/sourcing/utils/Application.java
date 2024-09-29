package io.learn.sourcing.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application implements Runnable {

    private static final int MAX_THREADS = 10;
    private final Set<String> visitedLinks = new HashSet<>();
    private String url;
    private ExecutorService executor;

    public Application(String startUrl) {
        this.url = startUrl;
        executor = Executors.newFixedThreadPool(MAX_THREADS);
    }

    @Override
    public void run() {
        crawl(url);
        executor.shutdown();
    }

    private void crawl(String url) {
        if(visitedLinks.contains(url)) {
            return; // Already visited this URL
        }

        try {
            Document doc = Jsoup.connect(url).get();
            Elements linksOnPage = doc.select("a[href]");

            System.out.println("Found (" + linksOnPage.size() + ") links on: " + url);

            visitedLinks.add(url);

            for(Element link: linksOnPage) {
                String nextLink = link.absUrl("href");
                if(notVisited(nextLink)) {
                    executor.execute(new Application(nextLink));
                }
            }
        } catch (IOException e) {
            System.err.println("For " + url + ": " + e.getMessage());
        }
    }

    private synchronized boolean notVisited(String nextLink) {
        if (visitedLinks.contains(nextLink)) {
            return false;
        } else {
            visitedLinks.add(nextLink);
            return true;
        }
    }

    public static void startScrapping(String url) {
        new Thread(new Application(url)).start();
    }
}