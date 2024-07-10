                        FROM eclipse-temurin:latest
						
						RUN pwd
						
						RUN ls -al
						
						COPY  eurekaserver-0.0.1-SNAPSHOT.jar /eurekaserver/eurekaserver.jar
						
						WORKDIR /eurekaserver
						
						RUN pwd
						
						RUN ls -al
                                             
                        EXPOSE 9400
						
						
                        CMD ["java", "-jar", "eurekaserver.jar"]
                    