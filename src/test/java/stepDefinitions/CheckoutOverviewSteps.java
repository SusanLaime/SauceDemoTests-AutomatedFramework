package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.CheckoutOverviewPage;
import utils.DriverManager;

public class CheckoutOverviewSteps {
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(DriverManager.getDriver().driver);

    @When("I click on finish button")
    public void clickOnFinishButton(){
        checkoutOverviewPage.clickOnFinishButton();
    }

    @Then("the item total should equal the sum of the product prices")
    public void verifyItemTotalEqualsSumOfPrices(){
        double expected = checkoutOverviewPage.getSumOfItemPrices();
        double actual = checkoutOverviewPage.getItemTotal();
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Then("the total should equal the item total plus tax")
    public void verifyTotalEqualsItemTotalPlusTax(){
        double expected = checkoutOverviewPage.getItemTotal() + checkoutOverviewPage.getTax();
        double actual = checkoutOverviewPage.getTotal();
        Assertions.assertEquals(expected, actual, 0.01);
    }
}
