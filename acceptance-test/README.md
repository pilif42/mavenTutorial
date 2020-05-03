# To run in a Terminal window:
    - TODO
    
    
# To run in IntelliJ:
    -TODO
        

# Section on placeholders used in test resources files
    - Note the testResources section in the acceptance-test/pom.xml & filtering = true.
    - Note the different notation between standard Maven (${...}) & MavenWithSpring (@...@) in acceptance-test/src/test/resources/config.properties.
    - To verify that placeholders are replaced correctly in test resources files:
           - mvn clean resources:testResources
           - under /mavenTutorial/acceptance-test/target/classes, see that the placeholder has been replaced in config.properties.
