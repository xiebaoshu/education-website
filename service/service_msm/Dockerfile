FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/service-msm.jar service-msm.jar
ENTRYPOINT ["java","-jar","/service-msm.jar", "&"]