                        FROM eclipse-temurin:latest
						
						RUN pwd
						
						RUN ls -al
						
						COPY  target/eurekaclient-0.0.1-SNAPSHOT.jar /eurekaclient/eurekaclient.jar
						
						WORKDIR /eurekaclient
						
						RUN pwd
						
						RUN ls -al
                                             
                        
						
						
                        CMD ["java", "-jar", "eurekaclient.jar"]
                    