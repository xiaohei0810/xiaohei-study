FROM ascdc/jdk8
MAINTAINER laoshirenxiaohei@xiaomi.com
COPY *.jar /app.jar
CMD ["--server.port=8080"]
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]