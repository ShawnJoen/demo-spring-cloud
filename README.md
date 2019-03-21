# demo-spring-cloud
All the "http://localhost" in the bootstrap.yml are replaced by your domain.

### Build
`mvn clean package`

### Zipkin Server
Download form https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/
######
`java -jar zipkin-server-2.9.4-exec.jar`
- After running,open the zipkin server http://192.168.2.140:9411/zipkin/

## Docker Build (use Dockerfile)
`./docker-build.sh`

### Eureka Server
`docker run -d -p 9000:9000 -v /www/data/demo-registry/logs:/logs/demo-registry demo/demo-spring-cloud-registry:1.0.0`
- After running,open the eureka server http://192.168.2.140:9000/

### Config Service
`docker run -d -p 8180:8180 -v /www/data/demo-config/logs:/logs/demo-config demo/demo-spring-cloud-config:1.0.0`

### User Service
`docker run -d -p 8190:8190 -v /www/data/user-service/logs:/logs/user-service demo/demo-spring-cloud-user-service:1.0.0`

### Gateway Service
`docker run -d -p 8181:8181 -v /www/data/demo-gateway/logs:/logs/demo-gateway demo/demo-spring-cloud-gateway:1.0.0`



