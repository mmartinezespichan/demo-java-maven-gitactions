FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD target/*.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "java -Dserver.port=$PORT -jar /app.jar" ]
