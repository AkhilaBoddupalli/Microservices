FROM openjdk:11-jre

ADD ./target/eurekaserver-0.0.1-SNAPSHOT.jar  eureka.jar

EXPOSE 8088

ENTRYPOINT ["java","-jar","eureka.jar"]
