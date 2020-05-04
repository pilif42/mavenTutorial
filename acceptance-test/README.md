# To run in a Terminal window:
    - mvn clean test
    - Note that I had to rename my runner class from Runner to RunnerTest. Otherwise, maven-surefire-plugin would not
    pick it up and as a result, no test was run.
                                
    
# To run in IntelliJ:
    - to build:
            - open View -> Tool Windows -> Maven 
            - click the refresh button (Reimport All Maven Projects)
            - select the required Maven Profile
            - run the 'clean' step followed by 'install' for 'demo-cuketests'
    - to run:
            - create a JUnit Run Config with:
                    - Class = com.example.demo.RunnerTest
                    - VM options = -ea
                    - Use classpath of module = demo-cuketests
        

# Section on placeholders used in test resources files
    - Note the testResources section in the acceptance-test/pom.xml & filtering = true.
    - Note the different notation between standard Maven (${...}) & MavenWithSpring (@...@) in acceptance-test/src/test/resources/config.properties.
    - To verify that placeholders are replaced correctly in test resources files:
           - mvn clean resources:testResources
           - under /mavenTutorial/acceptance-test/target/classes, see that the placeholder has been replaced in config.properties.
