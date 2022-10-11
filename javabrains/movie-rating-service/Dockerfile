FROM openjdk:19-jdk-alpine
ADD target/movie-rating-service.jar movie-rating-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/movie-rating-service.jar","--server.port=8082"]