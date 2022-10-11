FROM openjdk:19-jdk-alpine
ADD target/docker-department-service.jar docker-department-service.jar
ENTRYPOINT ["java","-jar","/docker-department-service.jar","--server.port=9001"]