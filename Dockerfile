FROM openjdk:17-jdk

WORKDIR /app

COPY target/test-0.0.1-SNAPSHOT.jar /app

EXPOSE 8079

CMD ["java", "-jar", "test-0.0.1-SNAPSHOT.jar"]