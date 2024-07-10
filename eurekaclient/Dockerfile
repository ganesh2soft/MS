                        FROM eclipse-temurin:latest
						
						RUN pwd
						
						RUN ls -al
						
						COPY  eurekaclient-0.0.1-SNAPSHOT.jar /eurekaclient/eurekaclient.jar
						
						WORKDIR /eurekaclient
						
						RUN pwd
						
						RUN ls -al
                                             
                        EXPOSE 9400
						
						
                        CMD ["java", "-jar", "eurekaclient.jar"]
                    