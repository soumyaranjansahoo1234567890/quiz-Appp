
FROM maven:3.6.3-openjdk-8 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:8-jdk-slim

WORKDIR /app

# Expose application port
EXPOSE 8080

# Copy the built JAR from the build stage
COPY --from=build /app/target/quiz-0.0.1-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
 
