FROM openjdk:8-jdk-alpine
ADD build/libs/configserver-0.0.1-SNAPSHOT.jar config.jar
ENTRYPOINT ["java","-jar", "/config.jar"]