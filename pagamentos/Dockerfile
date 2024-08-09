FROM mysql:8.0
FROM openjdk:17-jre-slim
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install
FROM maven:3.8.4-openjdk-17 AS build
COPY /target/pagamentos-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]