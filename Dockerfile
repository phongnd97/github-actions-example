FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-image-new.jar spring-boot-image-new.jar
ENTRYPOINT ["java","-jar","/spring-boot-image-new.jar"]