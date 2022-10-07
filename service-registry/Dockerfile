FROM openjdk:19-jdk-alpine
ADD target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 8005
ENTRYPOINT ["java","-jar","/docker-spring-boot.jar","--server.port=8082"]