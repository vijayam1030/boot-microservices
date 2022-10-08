FROM openjdk:19-jdk-alpine
ADD target/docker-cloud-gateway.jar docker-cloud-gateway.jar
EXPOSE 9296
ENTRYPOINT ["java","-jar","/docker-config-server.jar","--server.port=9296"]