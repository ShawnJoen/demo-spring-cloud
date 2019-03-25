# demo-spring-cloud
All the "http://localhost" in the bootstrap.yml are replaced by your domain.

#### Zipkin Server
Download form https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/
######
`java -jar zipkin-server-2.9.4-exec.jar`
- After running,open the zipkin page http://yourdomain:9411/zipkin/

### Build
`mvn clean package`

## Docker Build (use Dockerfile)
`./docker-build.sh`

#### Run Eureka Service
`docker run -d -p 9000:9000 -v /www/data/demo-registry/logs:/logs/demo-registry demo/demo-spring-cloud-registry:1.0.0`
- After running,open the eureka page http://yourdomain:9000/

#### Run Config Service
`docker run -d -p 8180:8180 -v /www/data/demo-config/logs:/logs/demo-config demo/demo-spring-cloud-config:1.0.0`

#### Run User Service
`docker run -d -p 8190:8190 -v /www/data/user-service/logs:/logs/user-service demo/demo-spring-cloud-user-service:1.0.0`

#### Run User2 Service
`docker run -d -p 8192:8192 -v /www/data/user2-service/logs:/logs/user-service demo/demo-spring-cloud-user2-service:1.0.0`

#### Run Order Service
`docker run -d -p 8191:8191 -v /www/data/order-service/logs:/logs/order-service demo/demo-spring-cloud-order-service:1.0.0`

#### Run Gateway Service
`docker run -d -p 8181:8181 -v /www/data/demo-gateway/logs:/logs/demo-gateway demo/demo-spring-cloud-gateway:1.0.0`
