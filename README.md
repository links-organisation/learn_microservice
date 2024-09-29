# shipme

### WE TAKE THE NEXT STEP TOGETHER

[![shipme](.assets/images/present_03.png)](https://github.com/links-organisation/shipme)

shipme est une application d'aide à l'importation ainsi que . Cette application vise à faciliter la création, la gestion et le suivi des caisses au sein de la shipme.

It can be previewed on my [GitHub](https://github.com/links-organisation/shipme) repository.

## Getting Started

To start building, clone this repository:

```bash
git clone https://github.com/links-organisation/shipme.git
```

Once cloned, run the following to install dependencies and run the app:

```bash
cd /path/to/the/cloned/repository/folder
# open with your code editor for exemple IntelliJ IDEA, Visual Studio Code or other else
idea ./ or code ./
```

## Structure

- We have 4 sub folders and the readme file:

  ```bash
  links@links:~/github/shipme$ ls
      docs  LICENSE  README.md  shipme_back  shipme_front
  ```

- The first element [docs](docs) is the folder containing the documentation, diagram and other needed documents.
- The second element [LICENCE](LICENSE) is the file which describe the license of the project.
- The third element is this [README.md](README.md) file which describe the project.
- The fourth element [shipme_back](shipme_back) is the folder containing the microservice back-end developed in Spring Boot x Spring Cloud framework of shipme.
- The last element [shipme_front](shipme_front) is the folder containing the front-end developed in Angular(Standalone) framework of shipme.

## Back-End
### Execution & Production

To execute the project, run:

- Firstly move to the back-end folder
    ```bash
    links@links:~/github/shipme$ cd shipme_back
    links@links:~/github/shipme/shipme_back$
    ```

- Secondly, run the file
    ```bash
    links@links:~/github/shipme/shipme_back$ ./script.sh
    Exécution du Serveur Eureka
    [INFO] Scanning for projects...
    [INFO]
    [INFO] ----------------------< io.shipme:shipme-server >-----------------------
    [INFO] Building shipme-server 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    2024-08-26T16:23:58.558+01:00  INFO 7708 --- [eureka-server] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8761 (http) with context path ''
    2024-08-26T16:23:58.559+01:00  INFO 7708 --- [eureka-server] [  restartedMain] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8761
    2024-08-26T16:23:58.588+01:00  INFO 7708 --- [eureka-server] [  restartedMain] io.shipme.server.ShipmeApplication       : Started ShipmeApplication in 6.835 seconds (process running for 7.267)
    Exécution du module des USER
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -----------------------< io.shipme:shipme-user >------------------------
    [INFO] Building shipme-user 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    2024-08-26T16:24:59.886+01:00  INFO 8015 --- [user-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_USER-SERVICE/192.168.76.195:user-service:8081: registering service...
    2024-08-26T16:24:59.900+01:00  INFO 8015 --- [user-service] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8081 (http) with context path ''
    2024-08-26T16:24:59.901+01:00  INFO 8015 --- [user-service] [  restartedMain] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8081
    2024-08-26T16:24:59.943+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-1] c.n.e.registry.AbstractInstanceRegistry  : Registered instance USER-SERVICE/192.168.76.195:user-service:8081 with status UP (replication=false)
    2024-08-26T16:24:59.945+01:00  INFO 8015 --- [user-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_USER-SERVICE/192.168.76.195:user-service:8081 - registration status: 204
    2024-08-26T16:24:59.954+01:00  INFO 8015 --- [user-service] [  restartedMain] io.shipme.user.UserApplication           : Started UserApplication in 7.281 seconds (process running for 7.802)
    2024-08-26T16:25:00.456+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-2] c.n.e.registry.AbstractInstanceRegistry  : Registered instance USER-SERVICE/192.168.76.195:user-service:8081 with status UP (replication=true)
    Exécution du module des PRODUCTS
    [INFO] Scanning for projects...
    [INFO]
    [INFO] ----------------------< io.shipme:shipme-product >----------------------
    [INFO] Building shipme-product 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    2024-08-26T16:25:56.849+01:00  INFO 8322 --- [pool-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_POOL-SERVICE/192.168.76.195:pool-service:8082: registering service...
    2024-08-26T16:25:56.863+01:00  INFO 8322 --- [pool-service] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8082 (http) with context path ''
    2024-08-26T16:25:56.865+01:00  INFO 8322 --- [pool-service] [  restartedMain] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8082
    2024-08-26T16:25:56.889+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-6] c.n.e.registry.AbstractInstanceRegistry  : Registered instance POOL-SERVICE/192.168.76.195:pool-service:8082 with status UP (replication=false)
    2024-08-26T16:25:56.890+01:00  INFO 8322 --- [pool-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_POOL-SERVICE/192.168.76.195:pool-service:8082 - registration status: 204
    2024-08-26T16:25:56.895+01:00  INFO 8322 --- [pool-service] [  restartedMain] io.shipme.product.ProductApplication     : Started ProductApplication in 7.562 seconds (process running for 8.029)
    2024-08-26T16:25:57.401+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-8] c.n.e.registry.AbstractInstanceRegistry  : Registered instance POOL-SERVICE/192.168.76.195:pool-service:8082 with status UP (replication=true)
    2024-08-26T16:25:58.516+01:00  INFO 7708 --- [eureka-server] [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
    Exécution du module des POOLS
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -----------------------< io.shipme:shipme-pool >------------------------
    [INFO] Building shipme-pool 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    2024-08-26T16:26:53.375+01:00  INFO 8608 --- [pool-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_POOL-SERVICE/192.168.76.195:pool-service:8083: registering service...
    2024-08-26T16:26:53.389+01:00  INFO 8608 --- [pool-service] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8083 (http) with context path ''
    2024-08-26T16:26:53.390+01:00  INFO 8608 --- [pool-service] [  restartedMain] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8083
    2024-08-26T16:26:53.418+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-8] c.n.e.registry.AbstractInstanceRegistry  : Registered instance POOL-SERVICE/192.168.76.195:pool-service:8083 with status UP (replication=false)
    2024-08-26T16:26:53.419+01:00  INFO 8608 --- [pool-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_POOL-SERVICE/192.168.76.195:pool-service:8083 - registration status: 204
    2024-08-26T16:26:53.455+01:00  INFO 8608 --- [pool-service] [  restartedMain] io.shipme.pool.PoolApplication           : Started PoolApplication in 7.235 seconds (process running for 7.683)
    2024-08-26T16:26:53.936+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-7] c.n.e.registry.AbstractInstanceRegistry  : Registered instance POOL-SERVICE/192.168.76.195:pool-service:8083 with status UP (replication=true)
    2024-08-26T16:26:58.516+01:00  INFO 7708 --- [eureka-server] [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
    Exécution du module des COMMANDES
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -----------------------< io.shipme:shipme-commande >------------------------
    [INFO] Building shipme-commande 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    2024-08-26T16:26:53.375+01:00  INFO 8608 --- [commande-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_COMMANDE-SERVICE/192.168.76.195:commande-service:8084: registering service...
    2024-08-26T16:26:53.389+01:00  INFO 8608 --- [commande-service] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8084 (http) with context path ''
    2024-08-26T16:26:53.390+01:00  INFO 8608 --- [commande-service] [  restartedMain] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8084
    2024-08-26T16:26:53.418+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-8] c.n.e.registry.AbstractInstanceRegistry  : Registered instance COMMANDE-SERVICE/192.168.76.195:commande-service:8084 with status UP (replication=false)
    2024-08-26T16:26:53.419+01:00  INFO 8608 --- [commande-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_COMMANDE-SERVICE/192.168.76.195:commande-service:8084 - registration status: 204
    2024-08-26T16:26:53.455+01:00  INFO 8608 --- [commande-service] [  restartedMain] io.shipme.commande.CommandeApplication           : Started CommandeApplication in 7.235 seconds (process running for 7.683)
    2024-08-26T16:26:53.936+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-7] c.n.e.registry.AbstractInstanceRegistry  : Registered instance COMMANDE-SERVICE/192.168.76.195:commande-service:8084 with status UP (replication=true)
    2024-08-26T16:26:58.516+01:00  INFO 7708 --- [eureka-server] [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
    Exécution du module des PAYEMENTS
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -----------------------< io.shipme:shipme-payment >------------------------
    [INFO] Building shipme-payment 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    2024-08-26T16:26:53.375+01:00  INFO 8608 --- [payment-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_PAYMENT-SERVICE/192.168.76.195:payment-service:8085: registering service...
    2024-08-26T16:26:53.389+01:00  INFO 8608 --- [payment-service] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8085 (http) with context path ''
    2024-08-26T16:26:53.390+01:00  INFO 8608 --- [payment-service] [  restartedMain] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8085
    2024-08-26T16:26:53.418+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-8] c.n.e.registry.AbstractInstanceRegistry  : Registered instance PAYMENT-SERVICE/192.168.76.195:payment-service:8085 with status UP (replication=false)
    2024-08-26T16:26:53.419+01:00  INFO 8608 --- [payment-service] [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_PAYMENT-SERVICE/192.168.76.195:payment-service:8085 - registration status: 204
    2024-08-26T16:26:53.455+01:00  INFO 8608 --- [payment-service] [  restartedMain] io.shipme.payment.PaymentApplication           : Started PaymentApplication in 7.235 seconds (process running for 7.683)
    2024-08-26T16:26:53.936+01:00  INFO 7708 --- [eureka-server] [nio-8761-exec-7] c.n.e.registry.AbstractInstanceRegistry  : Registered instance PAYMENT-SERVICE/192.168.76.195:payment-service:8085 with status UP (replication=true)
    2024-08-26T16:26:58.516+01:00  INFO 7708 --- [eureka-server] [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
    ```

### Unit Tests

- To run the unit tests once, run:

    ```bash
    links@links:~/github/shipme/shipme_back$ ./script__unit_tests.sh
    Exécution des tests du Serveur Eureka
    [INFO] Scanning for projects...
    [INFO]
    [INFO] ----------------------< io.shipme:shipme-server >-----------------------
    [INFO] Building shipme-server 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    2024-08-26T16:52:29.191+01:00  INFO 10884 --- [eureka-server] [      Thread-15] e.s.EurekaServerInitializerConfiguration : Started Eureka Server
    2024-08-26T16:52:29.194+01:00  INFO 10884 --- [eureka-server] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8761 (http) with context path ''
    2024-08-26T16:52:29.195+01:00  INFO 10884 --- [eureka-server] [  restartedMain] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8761
    2024-08-26T16:52:29.281+01:00  INFO 10884 --- [eureka-server] [  restartedMain] io.shipme.server.ShipmeApplication       : Started ShipmeApplication in 7.42 seconds (process running for 7.896)
    Exécution des tests du module des USER
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -----------------------< io.shipme:shipme-user >------------------------
    [INFO] Building shipme-user 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  31.584 s
    [INFO] Finished at: 2024-08-26T16:53:20+01:00
    [INFO] ------------------------------------------------------------------------
    Exécution des tests du module des PRODUCTS
    [INFO] Scanning for projects...
    [INFO]
    [INFO] ----------------------< io.shipme:shipme-product >----------------------
    [INFO] Building shipme-product 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  28.867 s
    [INFO] Finished at: 2024-08-26T16:54:20+01:00
    [INFO] ------------------------------------------------------------------------
    Exécution des tests du module des POOLS
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -----------------------< io.shipme:shipme-pool >------------------------
    [INFO] Building shipme-pool 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  28.040 s
    [INFO] Finished at: 2024-08-26T16:55:05+01:00
    [INFO] ------------------------------------------------------------------------
    Exécution des tests du module des COMMANDES
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -----------------------< io.shipme:shipme-commande >------------------------
    [INFO] Building shipme-commande 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  28.260 s
    [INFO] Finished at: 2024-08-26T16:55:49+01:00
    [INFO] ------------------------------------------------------------------------
    Exécution des tests du module des PAYMENTS
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -----------------------< io.shipme:shipme-payment >------------------------
    [INFO] Building shipme-payment 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    .
    .
    .
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  29.711 s
    [INFO] Finished at: 2024-08-26T16:56:35+01:00
    [INFO] ------------------------------------------------------------------------
    ```

## Front-End

### Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

### Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

### Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

### Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

### Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

### Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.dev/tools/cli) page.
