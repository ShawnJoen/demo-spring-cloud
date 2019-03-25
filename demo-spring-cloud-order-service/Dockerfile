FROM java:8
VOLUME /tmp
ADD target/demo-spring-cloud-order-service.jar /app.jar
EXPOSE 8191
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]