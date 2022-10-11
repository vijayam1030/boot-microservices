FROM openjdk:19-jdk-alpine
ADD target/docker-cloud-gateway.jar docker-cloud-gateway.jar
ENTRYPOINT ["java","-jar","/docker-cloud-gateway.jar","--server.port=9191"]