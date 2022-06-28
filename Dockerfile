FROM openjdk:8-alpine
MAINTAINER "Pradeep Kumar"
WORKDIR /employee
COPY *.jar /employee
CMD ["java","-jar","web-1.0.jar"]
EXPOSE 8080