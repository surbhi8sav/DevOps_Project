FROM openjdk:17-alpine
WORKDIR /opt
ENV port 1200
EXPOSE  1200
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar