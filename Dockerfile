FROM openjdk:11
VOLUME /tmp
EXPOSE 8081
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/app-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]