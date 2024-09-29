# learn_microservice

### WE TAKE THE NEXT STEP TOGETHER

[![learn_microservice](.assets/spring-removebg-preview/05-removebg-preview.png)](https://github.com/nduwarugirabruno/learn_microservice)

Learn_microservice est un repository pour apprendre le fonctionnement des micro-services ainsi que celui du JWT Authentication en utilisant la technologie Spring Boot x Spring Security.

It can be previewed on my [GitHub](https://github.com/nduwarugirabruno/learn_microservice) repository.

## Getting Started

To start building, clone this repository:

```bash
git clone https://github.com/nduwarugirabruno/learn_microservice.git
```

Once cloned, run the following to install dependencies and run the app:

```bash
cd /path/to/the/cloned/repository/folder
# open with your code editor for exemple IntelliJ IDEA or Visual Studio Code
idea ./
```

## Structure

We have 4 sub folders and the readme file:

```bash
links@links:~/IdeaProjects/learn_microservice$ ls
    eureka_server  README.md  shop_service  sourcing_service  user_service
```

- The first element is the folder [eureka_server](eureka_server) is the Eureka Server developed in Spring Boot x Spring Security x Spring Cloud framework
- The second element is this [README.md](README.md) file which describe the project.
- The third element is the folder [shop_service](shop_service) is the Shop Service developed in Spring Boot x Spring Security x Spring Cloud framework.
- The fourth element is the folder [sourcing_service](sourcing_service) is the Sourcing Service developed in Spring Boot x Spring Security x Spring Cloud framework.
- The last element is the folder [user_service](user_service) is the User Service developed in Spring Boot x Spring Security x Spring Cloud framework.

## Execution

To execute the project, run:

```bash
links@links:~/IdeaProjects/learn_microservice$ mvn spring-boot:run
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< io.nokash.app:learn_microservice >------------------------
[INFO] Building learn_microservice 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:3.2.3:run (default-cli) > test-compile @ learn_microservice >>>
     .
     .
     .
2024-03-07T13:28:24.502+01:00  INFO 55957 --- [  restartedMain] io.nokash.app.cofody.CofodyApplication   : Started CofodyApplication in 18.329 seconds (process running for 21.339)
```

## Production

To build for production, run:

```bash
links@links:~/IdeaProjects/learn_microservice$ mvn clean package
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< io.nokash.app:learn_microservice >------------------------
[INFO] Building learn_microservice 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
     .
     .
     .
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  02:09 min
[INFO] Finished at: 2024-03-07T13:26:33+01:00
[INFO] ------------------------------------------------------------------------
```

## Unit Tests

To run the unit tests once, run:

```bash
links@links:~/IdeaProjects/learn_microservice$ mvn clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< io.nokash.app:learn_microservice >------------------------
[INFO] Building learn_microservice 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
     .
     .
     .
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 36.03 s -- in io.nokash.app.cofody.CofodyApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  49.991 s
[INFO] Finished at: 2024-03-07T13:35:36+01:00
[INFO] ------------------------------------------------------------------------
```
