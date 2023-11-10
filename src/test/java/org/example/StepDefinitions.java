package org.example;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private int walletAmount;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }
    @Given("I have {int} euros in my wallet")
    public void iHaveEurosInMyWallet(int amount) {
        walletAmount = amount;
    }
    @When("I spend {int} euros")
    public void iSpendEuros(int amount) {
        walletAmount -= amount;
    }
    @Then("I should have {int} euros")
    public void iShouldHaveEuros(int amount) {
        assertEquals(amount, walletAmount);
    }

}
