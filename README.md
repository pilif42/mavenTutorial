# mavenTutorial
To play with Maven.


# To run in a Terminal window:
    - to build:
            - default profile (local): mvn clean install
            - dev profile: mvn clean install -P dev
    - cd target
    - java -jar demo-0.0.1-SNAPSHOT.jar
    
    
# To test
curl http://localhost:8080/greeting


# Section on placeholders used in resources files
    - Note the resources section in the pom.xml & filtering = true.
    - Note the different notation between standard Maven (${...}) & MavenWithSpring (@...@) in application.properties.
    - To verify that placeholders are replaced correctly in resources files:
           - mvn clean resources:resources -DtemplateMsg.per.env="Hello from Local to %s!"
           - under /mavenTutorial/target/classes, see that the placeholder has been replaced in application.properties.
