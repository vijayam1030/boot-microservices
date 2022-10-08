FROM openjdk:19-jdk-alpine
ADD target/docker-cloud-gateway.jar docker-cloud-gateway.jar
EXPOSE 9191
ENTRYPOINT ["java","-jar","/docker-cloud-gateway.jar","--server.port=9191"]