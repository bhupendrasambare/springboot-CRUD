FROM openjdk:11
EXPOSE 8081
ARG JAR_FILE=./target/CURD-1.0.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]