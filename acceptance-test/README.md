# To run in a Terminal window:
    - TODO as mvn test -Dcucumber.options="--tags @sample" -Dcucumber.options="-plugin junit:target/cucumber-reports/report.xml" does not run the Cuke tests at the moment.
            - I added this to the pom but that did not help:
                                <plugin>
                                    <groupId>org.apache.maven.plugins</groupId>
                                    <artifactId>maven-surefire-plugin</artifactId>
                                    <version>3.0.0-M4</version>
                                    <dependencies>
                                        <dependency>
                                            <groupId>org.apache.maven.surefire</groupId>
                                            <artifactId>surefire-junit47</artifactId>
                                            <version>3.0.0-M4</version>
                                        </dependency>
                                    </dependencies>
                                </plugin>
                                
    
# To run in IntelliJ:
    - to build:
            - open View -> Tool Windows -> Maven 
            - click the refresh button (Reimport All Maven Projects)
            - select the required Maven Profile
            - run the 'clean' step followed by 'install' for 'demo-cuketests'
    - to run:
            - create a JUnit Run Config with:
                    - Class = com.example.demo.Runner
                    - VM options = -ea
                    - Use classpath of module = demo-cuketests
        

# Section on placeholders used in test resources files
    - Note the testResources section in the acceptance-test/pom.xml & filtering = true.
    - Note the different notation between standard Maven (${...}) & MavenWithSpring (@...@) in acceptance-test/src/test/resources/config.properties.
    - To verify that placeholders are replaced correctly in test resources files:
           - mvn clean resources:testResources
           - under /mavenTutorial/acceptance-test/target/classes, see that the placeholder has been replaced in config.properties.
