FROM openjdk:8-jdk-alpine

COPY build/libs/gpsutil-1.2.0-SNAPSHOT.jar /GpsUtil.jar

CMD ["java", "-jar", "/GpsUtil.jar"]
