# 1st Docker build stage: build the project with Maven
FROM maven:3.6.3-openjdk-11 as builder
WORKDIR /template-project
COPY . /template-project/
RUN mvn clean package -DskipTests -e

# 2nd Docker build stage: copy builder output and configure entry point
FROM adoptopenjdk:11-jre-hotspot
ENV APP_DIR /application
ENV APP_FILE template-project-jar.jar

EXPOSE 8080

WORKDIR $APP_DIR
COPY --from=builder /template-project/target/*.jar $APP_DIR/$APP_FILE

CMD echo $profile
ENTRYPOINT ["sh", "-c","java $JAVA_OPTS -Dspring.profiles.active=$profile -jar $APP_FILE"]