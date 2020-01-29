FROM openjdk:alpine

EXPOSE 9091:9091

ADD /target/*.jar ms1.jar

ENTRYPOINT ["java","-jar","/ms1.jar"]
