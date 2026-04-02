FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/spring-boot-image-new.jar spring-boot-image-new.jar
ENTRYPOINT ["java","-jar","/spring-boot-image-new.jar"]