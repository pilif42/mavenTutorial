package com.example.demo.steps;

import cucumber.api.java.en.When;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SampleSteps {
    @When("the user says Hi!")
    public void the_user() {
        System.out.println("The user says Hi!");

        /**
         * TODO Here, we just print the content of config.properties to verify that Maven has replaced the placeholder activatedProfileThroughMaven.
         *
         * TODO You would normally read config.properties, use the value of cuke.profiles.active to then read the relevant cuke-{env}.propeties.
         */
        Path pathToConfigFile = Paths.get("src/test/resources/config.properties");
        try {
            Files.readAllLines(pathToConfigFile, StandardCharsets.UTF_8).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("the machine says Yo!")
    public void the_machine() {
        System.out.println("The machine says Yo!");
    }
}
