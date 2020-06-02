FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/service-acl.jar service-acl.jar
ENTRYPOINT ["java","-jar","/service-acl.jar", "&"]