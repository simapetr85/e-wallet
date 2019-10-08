# Download Maven
FROM maven:3.5-jdk-8-alpine
WORKDIR /app

# Copy project
COPY app /app

# Building
RUN mvn package

# When docker container start it will run this command 
ENTRYPOINT ["java","-jar","target/SOME_JAR.jar"]

# Mužeš použít multistage docker build, kde si označíš container nejakym jmenem ( AS builder ) 
# v tom containeru vybuildíš mvn appku a jenom to hotové jarko nakopčíš do toho druhého containeru.  (COPY --from=builder ...)
# Ten druhý container je ten co se ti pak spouští a ten builder se zahodí. Výsledkem je malinký vybuilděný image jen s tvojí appkou.
# Těch stagí tam mužeš mít kolik chces, ale je tam trochu problem s cashováním dependencí. Jinak je to krásně flexibilní 
# a na serveru/pc kde mas docker už nemusíš instalovat žádny maven/gradle/npm/ a podobné věci, stačí tam jen to na cem to běží.  
#
# multistage build example:
#
# FROM maven:3.5-jdk-8-alpine AS builder
# WORKDIR /app
# COPY app /app
# RUN mvn package
#
# FROM openjdk:14-jdk-slim
# WORKDIR /app
# COPY --from=builder /app/target/*.jar app.jar
# ENTRYPOINT ["java","-jar","app.jar"]
