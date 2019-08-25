FROM openjdk:11-jre

ADD ./target/configserver-0.0.1-SNAPSHOT.jar  config.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","config.jar"]

