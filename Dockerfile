
# Use the official Java 11 image as the base image
FROM openjdk:latest

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Java file (and any required resources) from your local machine to the container
COPY HelloWorld.java .

# Compile the Java source file
RUN javac HelloWorld.java

# Run the Java application inside the container
CMD ["Java", "HelloWorld"]

