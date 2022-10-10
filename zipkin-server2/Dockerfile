FROM openjdk:19-jdk-alpine
ADD zipkin-server-2.23.19-exec.jar zipkin-server-2.23.19-exec.jar
EXPOSE 9411
ENTRYPOINT ["java","-jar","/zipkin-server-2.23.19-exec.jar","--server.port=9411"]