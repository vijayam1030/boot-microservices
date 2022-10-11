FROM openjdk:19-jdk-alpine
ADD target/movie-info-service.jar movie-info-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/movie-info-service.jar","--server.port=8081"]