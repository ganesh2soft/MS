                        FROM eclipse-temurin:latest
						
						RUN pwd
						
						RUN ls -al
						
						RUN dir
						
						COPY  target/apigateway-0.0.1-SNAPSHOT.jar /apigateway/apigateway.jar
						
						WORKDIR /apigateway
						
						RUN pwd
						
						RUN ls -al
                                             
                        EXPOSE 9400
						
						
                        CMD ["java", "-jar", "apigateway.jar"]
                    