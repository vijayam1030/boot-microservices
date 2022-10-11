FROM openjdk:19-jdk-alpine
ADD target/docker-service-registry.jar docker-service-registry.jar
ENTRYPOINT ["java","-jar","/docker-service-registry.jar","--server.port=8761"]