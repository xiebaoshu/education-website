FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/service-cms.jar service-cms.jar
ENTRYPOINT ["java","-jar","/service-cms.jar", "&"]