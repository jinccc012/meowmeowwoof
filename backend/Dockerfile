# Use the official OpenJDK 21 as a parent image
FROM openjdk:21-ea-31-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target/build directory to the container
COPY ./target/meowmeowwoof-0.0.1-SNAPSHOT.jar /app/meowmeowwoof-0.0.1-SNAPSHOT.jar
# If using Gradle, the path might be build/libs/your-app-name.jar

# Expose the port that your application will run on
EXPOSE 8080

# Set the entry point for the container to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/meowmeowwoof-0.0.1-SNAPSHOT.jar"]