# Spring Boot Flyway Example

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

## Steps to setup

**1. Clone the application**

```bash
git clone https://github.com/chintanb/spring-boot-flyway-example.git
```

**2. Modify application properties to add your database url, username and password**

+ open `src/main/resources/application.properties`

+ change `db.url` and `db.username` and `db.password` 

**4. Build and run the app using maven**

```bash
cd spring-boot-flyway-example
mvn package
java -jar target/flyway-demo-0.0.1-SNAPSHOT.jar
```

You can also run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app creates a database called demo (recreates if it already existed), runs V1__schema migrations on it and exits.