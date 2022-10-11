FROM openjdk:19-jdk-alpine
ADD target/docker-user-service.jar docker-user-service.jar
ENTRYPOINT ["java","-jar","/docker-user-service.jar","--server.port=9002"]