# Download Maven
FROM maven:3.5-jdk-8-alpine
WORKDIR /app

# Copy project
COPY app /app

# Building
RUN mvn package

# When docker container start it will run this command 
ENTRYPOINT ["java","-jar","target/SOME_JAR.jar"]
