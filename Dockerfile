FROM openjdk:8
EXPOSE 8080
ADD target/BookApplication.jar BookApplication.jar
ENTRYPOINT ["java","-jar","/BookApplication.jar"]