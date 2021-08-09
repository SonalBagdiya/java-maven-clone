FROM infyartifactory.ad.infosys.com/devopscoe-docker/maven:latest
MAINTAINER umang.srivastava01@infosys.com
ADD ./target/petclinic.war /tmp
ADD ./mvnw /tmp
ADD ./mvnw.cmd /tmp
ADD ./.mvn/wrapper/ /tmp
EXPOSE 8080
#COPY files/spring-cloud-config-server-entrypoint.sh /opt/spring-cloud/bin/
ENTRYPOINT ["/tmp"]
#CMD ["-jar", "/opt/springboot/petclinic.war"]
#CMD ["catalina.sh","run"]
CMD ["mvnw", "jetty:run-war"]
