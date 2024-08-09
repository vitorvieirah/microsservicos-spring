FROM openjdk:11-jre-slim
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install
FROM maven:3.8.4-openjdk-11 AS build
COPY /target/gateway-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]