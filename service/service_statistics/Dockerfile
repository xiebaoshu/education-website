FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/service-statistics.jar service-statistics.jar
ENTRYPOINT ["java","-jar","/service-statistics.jar", "&"]