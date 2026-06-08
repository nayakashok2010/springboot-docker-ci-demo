FROM eclipse-temurin:21

LABEL authors="Ashok"

# Set working directory
WORKDIR /app

# Copy application JAR
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8080


# Run the application
CMD ["java", "-jar", "app.jar"]