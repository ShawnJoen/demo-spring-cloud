#!/bin/bash

cd /www/demo-spring-cloud/demo-spring-cloud-registry
docker build -t demo/demo-spring-cloud-registry:1.0.0 .

cd /www/demo-spring-cloud/demo-spring-cloud-config
docker build -t demo/demo-spring-cloud-config:1.0.0 .

cd /www/demo-spring-cloud/demo-spring-cloud-user-service
docker build -t demo/demo-spring-cloud-user-service:1.0.0 .

cd /www/demo-spring-cloud/demo-spring-cloud-gateway
docker build -t demo/demo-spring-cloud-gateway:1.0.0 .