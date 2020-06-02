FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/service-edu.jar service-edu.jar
ENTRYPOINT ["java","-jar","/service-edu.jar", "&"]