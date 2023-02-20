package com.microfocus.adm.octane.gherkinautomation;

import static org.junit.Assert.*;
import cucumber.api.java.en.*;

public class StepDefinitions {
    @Given("^the Google Chrome browser is open$")
    public void theGoogleChromeBrowserIsOpen() {
        System.out.println("The browser is open!");
        // assertTrue(false);
        System.out.println("The test worked!");
    }

    @When("asdf")
    public void asdf() {
        assertEquals(1, 1);
    }


    @When("^opening the live chat$")
    public void openingTheLiveChat() {
        System.out.println("opening live chat!");
    }

    @Given("run feature {string} is done")
    public void runFeature(String str) {
        System.out.println("runFeature - " + str);
    }


    @Then("^the chat works$")
    public void theChatWorks() {
        System.out.println("The test worked!");
        int x = 5;
        System.out.println("The test worked!");
    }

    @Given("a web browser is on the Google page")
    public void aWebBrowserIsOnTheGooglePage() throws Exception {
        //   throw new Exception("exception in given");
        System.out.println("The test worked!");
    }

    @When("the search phrase {string} is entered")
    public void theSearchPhraseIsEntered(String arg0) {

    }

    @Then("results for {string} are shown")
    public void resultsForAreShown(String arg0) throws Exception {
        //   throw new Exception("exception!");
        System.out.println("The test worked!");

    }

    @And("the related results include {string}")
    public void theRelatedResultsInclude(String arg0) throws Exception {

    }

    @But("the related results do not include {string}")
    public void theRelatedResultsDoNotInclude(String arg0) {
    }

    @And("the following related results are shown")
    public void theFollowingRelatedResultsAreShown() throws Exception {

    }

    @And("the related results include Panda Express")
    public void theRelatedResultsIncludePandaExpress() {
    }

    @Given("I said <word>")
    public void iSaidWord() {

    }

    @When("You hear I said <word>")
    public void youHearISaidWord() {

    }

    @Then("You scram <answer>")
    public void youScramAnswer() {
    }

    @Given("I said {string}")
    public void iSaid(String arg0) {

    }

    @When("You hear I said {string}")
    public void youHearISaid(String arg0) {

    }

    @Then("You scream {string}")
    public void youScream(String arg0) {
    }

    @Given("payment security system is up")
    public void paymentSecuritySystemIsUp() {

    }

    @Given("a customer named <customer>")
    public void aCustomerNamedCustomer() {

    }

    @Given("I am logged in as <customer>")
    public void iAmLoggedInAsCustomer() {

    }

    @Given("I have at least one item in cart")
    public void iHaveAtLeastOneItemInCart() {

    }

    @When("I try to buy items in my cart")
    public void iTryToBuyItemsInMyCart() {

    }

    @Given("a customer named {string}")
    public void aCustomerNamed(String arg0) {

    }

    @Given("I am logged in as {string}")
    public void iAmLoggedInAs(String arg0) {

    }

    @Then("I confirm my payment method {string} and proceed to checkout.")
    public void iConfirmMyPaymentMethodAndProceedToCheckout(String arg0) {
    }

    @Then("hi")
    public void hi() {
    }

    @Given("g")
    public void g() {

    }

    @When("w")
    public void w() {


    }

    @Then("t")
    public void t() {
        assertTrue("bubu message", true);
    }

    @Then("t2")
    public void t2() {
        assertEquals(6, 6);
    }

    @When("asdfasdfa")
    @And("new step")
    public void oneWhen() {
        assertEquals(1, 1);
    }

    @Then("adfafas")
    public void oneThen() {
        assertEquals(1, 1);
    }

    @Given("thatn")
    public void oneGiven() {
        assertEquals(1, 1);
    }

    @Given("a client user on the dashboard page of the application")
    public void aClientUserOnTheDashboardPageOfTheApplication() {
    }

    @When("a client adds a product to the cart")
    public void aClientAddsAProductToTheCart() {

    }

    @Then("the product is added to his card")
    public void theProductIsAddedToHisCard() {

    }

    @And("the special rules at the given moment are applied")
    public void theSpecialRulesAtTheGivenMomentAreApplied() {

    }

    @And("the total price show the right amount of money, taking in consideration the discounts from the special rules")
    public void theTotalPriceShowTheRightAmountOfMoneyTakingInConsiderationTheDiscountsFromTheSpecialRules() {

    }

    @When("client user adds to cart the {string} units of {string} having the code {string}")
    public void clientUserAddsToCartTheUnitsOfHavingTheCode(String arg0, String arg1, String arg2) {

    }

    @Then("the client see that in his cart there are twice the {string} of product")
    public void theClientSeeThatInHisCartThereAreTwiceTheOfProduct(String arg0) {

    }

    @And("total price is computed as {string} times {string}")
    public void totalPriceIsComputedAsTimes(String arg0, String arg1) {

    }

    @When("client adds to cart a number of {string} units of {string}, more or equal than {string} units")
    public void clientAddsToCartANumberOfUnitsOfMoreOrEqualThanUnits(String arg0, String arg1, String arg2) {

    }

    @Then("the client sees in his cart that instiad of the original price {string} per unit of <product> he has to pay a new price {string} per unit")
    public void theClientSeesInHisCartThatInstiadOfTheOriginalPricePerUnitOfProductHeHasToPayANewPricePerUnit(String arg0, String arg1) {
    }

    @Then("the client sees in his cart that instiad of the original price {string} per unit of <product> he has to pay a new price which is {string} percentage of the original price {string}")
    public void theClientSeesInHisCartThatInstiadOfTheOriginalPricePerUnitOfProductHeHasToPayANewPriceWhichIsPercentageOfTheOriginalPrice(String arg0, String arg1, String arg2) {
    }

    @Given("an admin user is on the configuration page")
    public void anAdminUserIsOnTheConfigurationPage() {
    }

    @When("the admin user changes the original file path {string} for {string}")
    public void theAdminUserChangesTheOriginalFilePathFor(String arg0, String arg1) {
    }

    @Then("the application is reloaded and use the {string} that can be found at the new location {string}")
    public void theApplicationIsReloadedAndUseTheThatCanBeFoundAtTheNewLocation(String arg0, String arg1) {
    }

    @Then("the client sees in his cart that instead of the original price {string} per unit of {string} he has to pay a new price {string} per unit")
    public void theClientSeesInHisCartThatInsteadOfTheOriginalPricePerUnitOfHeHasToPayANewPricePerUnit(String arg0, String arg1, String arg2) {
    }

    @Then("the client sees in his cart that instead of the original price {string} per unit of {string} he has to pay a new price which is {string} percentage of the original price {string}")
    public void theClientSeesInHisCartThatInsteadOfTheOriginalPricePerUnitOfHeHasToPayANewPriceWhichIsPercentageOfTheOriginalPrice(String arg0, String arg1, String arg2, String arg3) {
    }

    @And("it is working")
    public void itIsWorking() {
    }

    @Given("a test")
    public void aTest() {
    }

    @When("you run it")
    public void youRunIt() {
    }

    @Then("you have results")
    public void youHaveResults() {
    }
}
