FROM openjdk:11
ARG JAR_FILE=target/*.jar
Copy ./target/CURD-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081