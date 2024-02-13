FROM openjdk:17
EXPOSE 9093
ADD target/HW.jar HW.jar
ENTRYPOINT ["java","-jar","/HW.jar"]