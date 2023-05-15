FROM openjdk:17-jdk-alpine
EXPOSE 8082
WORKDIR /app
COPY target/spring-boot-docker.jar app.jar
COPY database.sql /docker-entrypoint-initdb.d/
RUN apk add --no-cache postgresql && \
    apk add --no-cache postgresql-client && \
    apk add --no-cache bash
CMD ["java", "-jar", "app.jar"]
