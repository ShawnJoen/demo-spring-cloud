FROM java:8
VOLUME /tmp
ADD target/demo-spring-cloud-user2-service.jar /app.jar
EXPOSE 8192
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]