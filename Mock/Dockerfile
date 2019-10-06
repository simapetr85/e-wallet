# Download Java
FROM openjdk:14-slim
WORKDIR /app

# Download Maven
FROM maven:3.5-jdk-8-alpine
WORKDIR /app

# Copy project
COPY app /app

# Running
RUN mvn spring-boot:run
