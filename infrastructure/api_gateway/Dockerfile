FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/service-gateway.jar service-gateway.jar
ENTRYPOINT ["java","-jar","/service-gateway.jar", "&"]