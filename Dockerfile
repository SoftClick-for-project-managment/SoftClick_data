FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 1099

ARG JAR_FILE=./*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]