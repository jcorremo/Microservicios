FROM openjdk:8-jre-alpine
ADD target/*.jar Publisher-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Publisher-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080