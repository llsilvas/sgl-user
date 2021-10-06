FROM maven:3.6.3-openjdk-11-slim as builder

ARG JAR_FILE=*.jar
ADD ${JAR_FILE} app.jar

ENV RABBITMQ_HOST=""
ENV SPRING_PROFILES_ACTIVE="docker"

EXPOSE 8086

ENTRYPOINT ["java","-jar","app.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
