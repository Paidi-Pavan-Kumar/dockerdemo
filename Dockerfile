# ---- Stage 1: Build the app ----
FROM maven:3.9.3-eclipse-temurin-17 as builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# ---- Stage 2: Run the app ----
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/dockerdemo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
