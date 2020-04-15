FROM openjdk:8-jdk-alpine
RUN mkdir  /app/
ADD target/firstDocker-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]