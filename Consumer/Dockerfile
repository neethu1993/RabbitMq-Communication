FROM openjdk:11
ADD ./target/pocrabbitmq-0.0.1-SNAPSHOT.jar /usr/src/pocrabbitmq-0.0.1-SNAPSHOT.jar
EXPOSE 8081
WORKDIR usr/src
ENTRYPOINT ["java","-jar","pocrabbitmq-0.0.1-SNAPSHOT.jar"]