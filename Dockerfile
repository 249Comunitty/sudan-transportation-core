FROM openjdk:17
EXPOSE 8080
ENV DB_NAME=db_st \
    DB_HOST_IP=host.docker.internal \
    DB_PORT=3306 \
    DB_USER=username \
    DB_PASSWORD=password \
    PROJECT_PATH_NAME=st
ARG JAR_FILE=build/libs/sudan-transportation-core-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} st-app.jar
ENTRYPOINT ["java", "-jar", "/st-app.jar"]