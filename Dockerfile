
FROM gradle:6.2-jdk13
USER root

COPY ./ /home/gradle

RUN gradle clean build && \
    cp /home/gradle/build/libs/messenger-test-1.0-SNAPSHOT.jar /opt && \
    rm -rf /home/gradle/**

CMD ["java", "-jar", "/opt/messenger-test-1.0-SNAPSHOT.jar"]
#CMD "java -jar /opt/messenger-test-1.0-SNAPSHOT.jar"