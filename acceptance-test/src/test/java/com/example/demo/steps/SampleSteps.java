package com.example.demo.steps;

import cucumber.api.java.en.When;

public class SampleSteps {
    @When("the user says Hi!")
    public void the_user() {
        System.out.println("The user says Hi!");
    }

    @When("the machine says Yo!")
    public void the_machine() {
        System.out.println("The machine says Yo!");
    }
}
