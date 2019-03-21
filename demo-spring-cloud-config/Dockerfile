FROM java:8
VOLUME /tmp
ADD target/demo-spring-cloud-config.jar /app.jar
EXPOSE 8180
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]