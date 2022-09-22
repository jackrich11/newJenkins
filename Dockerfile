from openjdk

COPY ./src/main/java/*.java /

RUN javac /UseCalculator.java /Calculator.java

ENTRYPOINT ["java", "UseCalculator"]

