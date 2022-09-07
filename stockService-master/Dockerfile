FROM openjdk:17-jdk-alpine
EXPOSE 8082
ADD /target/stockService.jar stockService.jar
ENTRYPOINT ["java","-jar","/stockService.jar"]