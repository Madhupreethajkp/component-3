FROM openjdk:17-jdk-alpine
EXPOSE 8081
ADD /target/companyService.jar companyService.jar
ENTRYPOINT ["java","-jar","/companyService.jar"]