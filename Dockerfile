# Start with a base image containing Java runtime
FROM java:8

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/rest-demo-1.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} rest-demo.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/rest-demo.jar"]