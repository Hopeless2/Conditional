FROM bellsoft/liberica-openjdk-alpine:latest-x86_64

EXPOSE 8081

ADD target/Conditional-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java","-jar","/myapp.jar"]