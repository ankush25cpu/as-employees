FROM openjdk:11

RUN  mkdir -p /usr/src/myapp

COPY ./target/as-employees-0.0.1-SNAPSHOT.jar /usr/src/myapp

WORKDIR /usr/src/myapp

CMD ["java", "-jar", "as-employees-0.0.1-SNAPSHOT.jar"]