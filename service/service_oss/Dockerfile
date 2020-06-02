FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/service-oss.jar service-oss.jar
ENTRYPOINT ["java","-jar","/service-oss.jar", "&"]