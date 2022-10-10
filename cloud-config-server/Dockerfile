FROM openjdk:19-jdk-alpine
ADD target/docker-config-server.jar docker-config-server.jar
EXPOSE 9296
ENTRYPOINT ["java","-jar","/docker-config-server.jar","--server.port=9296"]