FROM openjdk:8
COPY ./target/Calculator_mini_project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","Calculator_mini_project-1.0-SNAPSHOT-jar-with-dependencies.jar","Application.Calculator"]
