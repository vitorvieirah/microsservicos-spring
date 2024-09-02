FROM openjdk:11-jre-slim
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY pom.xml .
COPY src ./src
RUN mvn clean install
FROM maven:3.8.4-openjdk-11 AS build
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]












