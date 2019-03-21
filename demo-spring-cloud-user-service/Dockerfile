FROM java:8
VOLUME /tmp
ADD target/demo-spring-cloud-user-service.jar /app.jar
EXPOSE 8190
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]