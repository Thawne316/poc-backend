FROM openjdk:8-jdk-alpine
ADD build/libs/worklog-display-0.0.1-SNAPSHOT.jar displayservice.jar
ENTRYPOINT ["java","-jar", "/displayservice.jar"]