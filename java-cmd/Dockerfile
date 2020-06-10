FROM amazoncorretto:8u242

COPY target/example-jar-with-dependencies.jar  runtime.jar

EXPOSE 8989
VOLUME wd
WORKDIR wd

ENTRYPOINT ["java","-jar","/runtime.jar"]