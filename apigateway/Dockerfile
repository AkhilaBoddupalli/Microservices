FROM openjdk:11-jre

ADD ./target/apigateway-0.0.1-SNAPSHOT.jar  app.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","app.jar"]
