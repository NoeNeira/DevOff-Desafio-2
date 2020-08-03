FROM maven:3.6.3-jdk-11 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean install

FROM adoptopenjdk/openjdk11:ubi
COPY --from=build /usr/src/app/target/devoff-desafio-2-*-SNAPSHOT.jar /usr/app/target/devoff.jar
EXPOSE 8080
CMD ["java","-jar","/usr/app/target/devoff.jar"]