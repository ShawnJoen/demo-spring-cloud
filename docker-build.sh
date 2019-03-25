#!/bin/bash

echo "===> registry"
cd /www/demo-spring-cloud/demo-spring-cloud-registry/
docker build -t demo/demo-spring-cloud-registry:1.0.0 .

echo "===> config"
cd /www/demo-spring-cloud/demo-spring-cloud-config/
docker build -t demo/demo-spring-cloud-config:1.0.0 .

echo "===> user-service"
cd /www/demo-spring-cloud/demo-spring-cloud-user-service/
docker build -t demo/demo-spring-cloud-user-service:1.0.0 .

echo "===> user2-service"
cd /www/demo-spring-cloud/demo-spring-cloud-user2-service/
docker build -t demo/demo-spring-cloud-user2-service:1.0.0 .

echo "===> order-service"
cd /www/demo-spring-cloud/demo-spring-cloud-order-service/
docker build -t demo/demo-spring-cloud-order-service:1.0.0 .

echo "===> gateway"
cd /www/demo-spring-cloud/demo-spring-cloud-gateway/
docker build -t demo/demo-spring-cloud-gateway:1.0.0 .
