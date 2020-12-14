FROM openjdk:11-jre-slim

# Install prerequisites
RUN apt-get update && apt-get install -y \
curl

# copy the packaged jar file into our docker image
COPY target/contratacao-0.0.1.jar /contratacao.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/contratacao.jar"]