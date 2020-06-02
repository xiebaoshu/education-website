FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/service-ucenter.jar service-ucenter.jar
ENTRYPOINT ["java","-jar","/service-ucenter.jar", "&"]