FROM openjdk:19-jdk-alpine
ADD target/catalog-service.jar catalog-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/catalog-service.jar","--server.port=8080"]