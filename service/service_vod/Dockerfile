FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/service-vod.jar service-vod.jar
ENTRYPOINT ["java","-jar","/service-vod.jar", "&"]