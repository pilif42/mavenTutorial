# mavenTutorial
To play with Maven.


# To run in a Terminal window:
    - to build:
            - default Maven profile (local): mvn clean install
            - dev Maven profile: mvn clean install -P dev
    - cd api/target
    - java -jar demo-0.0.1-SNAPSHOT.jar
    
    
# To run in IntelliJ:
    - to build:
            - open View -> Tool Windows -> Maven 
            - click the refresh button (Reimport All Maven Projects)
            - select the required Maven Profile
            - run the 'clean' step followed by 'install' for 'demo'
    - to run:
            - add a SpringBoot Run Config pointing to DemoApplication & using module 'demo-api'.
        
    
# To test
curl http://localhost:8080/greeting


# Section on placeholders used in resources files
    - Note the resources section in the api/pom.xml & filtering = true.
    - Note the different notation between standard Maven (${...}) & MavenWithSpring (@...@) in api/src/main/resources/application.properties.
    - To verify that placeholders are replaced correctly in resources files:
           - mvn clean resources:resources -DtemplateMsg.per.env="Hello from Local to %s!"
           - under /mavenTutorial/api/target/classes, see that the placeholder has been replaced in application.properties.
    - Note that we have activated the Spring Boot profile using the Maven profile by simply controlling the value of
    spring.profiles.active in application.properties.
