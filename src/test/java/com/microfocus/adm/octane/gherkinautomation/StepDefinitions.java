package com.microfocus.adm.octane.gherkinautomation;

import static org.junit.Assert.*;


import cucumber.api.java.de.Angenommen;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Und;
import cucumber.api.java.de.Wenn;
import cucumber.api.java.en.*;
import cucumber.api.java.gl.*;
import org.junit.Assert;


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
        assertEquals(3, 1+1);
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

    @Given("<param{int}>")
    public void param(int arg0) {

    }

    @Given("df")
    public void df() {
    }

    @When("ff")
    public void ff() {
    }

    @Then("ggg")
    public void ggg() {
    }

    @Dado("tr")
    public void tr() {
    }

    @Cando("ty")
    public void ty(){
    }



    @Dado("ssss {string}")
    public void emptyDado(String param1){
    }

    @Cando("sss {string}")
    public void emptyCando(String param2){}

    @Angenommen("sdsd")
    public void sdsd() {
    }

    @Wenn("ds")
    public void ds() {
    }

    @Dann("sdfsdf")
    public void sdfsdf() {
    }

    @Und("sdf")
    public void sdf() {
    }

    @Wenn("sdg")
    public void sdg() {
    }

    @Dann("sddf")
    public void sddf() {
    }

    @Given("rfr")
    public void rfr() {
    }

    @When("gyb")
    public void gyb() {
    }

    @Then("wrgvt")
    public void wrgvt() {
    }

    @Wenn("sdgqqAiciamschimbat")
    public void sdgqqaiciamschimbat() {
    }

    @Given("Me encuentro en la pagina inicio de salesforce")
    public void meEncuentroEnLaPaginaInicioDeSalesforce() {
    }

    @When("Inicio sesion con {string} y {string} validos en ambiente {string}")
    public void inicioSesionConYValidosEnAmbiente(String arg0, String arg1, String arg2) {
    }

    @Then("Se logra ver la vista ejecutivo en la pagina de SF")
    public void seLograVerLaVistaEjecutivoEnLaPaginaDeSF() {
    }

    @Given("Inicio sesion con en el usuario en SF {string}")
    public void inicioSesionConEnElUsuarioEnSF(String arg0) {
    }

    @When("Busco y selecciono el {string} del resultado de la busqueda")
    public void buscoYSeleccionoElDelResultadoDeLaBusqueda(String arg0) {
    }

    @And("Valido el campo tipo de registro que diga {string} en la vista casos")
    public void validoElCampoTipoDeRegistroQueDigaEnLaVistaCasos(String arg0) {
    }

    @And("Valido que la etapa del caso sea {string}")
    public void validoQueLaEtapaDelCasoSea(String arg0) {
    }

    @And("Presiono el boton {string} del componente casos relacionados")
    public void presionoElBotonDelComponenteCasosRelacionados(String arg0) {
    }

    @And("Selecciono {string} en el campo unidad de negocio")
    public void seleccionoEnElCampoUnidadDeNegocio(String arg0) {
    }

    @And("Selecciono {string} en el campo departamento")
    public void seleccionoEnElCampoDepartamento(String arg0) {
    }

    @And("Selecciono {string} en el campo producto")
    public void seleccionoEnElCampoProducto(String arg0) {
    }

    @And("Selecciono {string} en el campo categoria")
    public void seleccionoEnElCampoCategoria(String arg0) {
    }

    @And("Ingreso fecha hoy en el campo fecha de vencimiento")
    public void ingresoFechaHoyEnElCampoFechaDeVencimiento() {
    }

    @And("Ingreso {string} en el campo descripcion")
    public void ingresoEnElCampoDescripcion(String arg0) {
    }

    @And("Presiono el boton guardar en el subcaso")
    public void presionoElBotonGuardarEnElSubcaso() {
    }

    @Then("El sub caso se crea correctamente y me direcciona al page layout de este")
    public void elSubCasoSeCreaCorrectamenteYMeDireccionaAlPageLayoutDeEste() {
    }

    @And("Visualizo la fecha en el campo Fecha de Vencimiento en el subcaso creado")
    public void visualizoLaFechaEnElCampoFechaDeVencimientoEnElSubcasoCreado() {
    }

    @Given("step1Alis")
    public void step1Alis() {
    }
    
    @When("step2Alis")
    public void step2Alis() {
    }
    
    @And("step2Alis1")
    public void step2Alis1() {
    }

     @Then("step4Alis")
    public void step4Alis() {
         assertEquals(1, 2);
    }

    @Given("StepScenarioBDDAlis3")
    public void StepScenarioBDDAlis3() {
    }
    
    @When("WhenScenarioBDDAlis3")
    public void WhenScenarioBDDAlis3() {
    }

     @Then("ThenScenarioBDDAlis3")
    public void ThenScenarioBDDAlis3() {
         assertEquals(1, 1);
    }

     @Given("StepAlisNew")
    public void StepAlisNew() {
    }
    
    @When("WhenAlisNew")
    public void WhenAlisNew() {
    }

     @Then("ThenAlisNew")
    public void ThenAlisNew() {
         assertEquals(1, 1);
    }
    
    @Given("step1BDDNewOctane10_12")
    public void step1BDDNewOctane10_12() {
    }
    
    @When("step2BDDNewOctane10_12")
    public void step2BDDNewOctane10_12() {
    }

     @Then("step3BDDNewOctane10_12")
    public void step3BDDNewOctane10_12() {
         assertEquals(1, 1);
    }

    @Given("givenStep16")
    public void givenStep16() {
    }
    
    @When("whenStep16")
    public void whenStep16() {
    }

     @Then("thenStep16")
    public void thenStep16() {
         assertEquals(1, 1);
    }

     @Given("givenBDDNewAlis")
    public void givenBDDNewAlis() {
    }
    
    @When("whenBDDNewAlis")
    public void whenBDDNewAlis() {
    }

     @Then("thenBDDNewAlis")
    public void thenBDDNewAlis() {
         assertEquals(1, 1);
    }

    @Angenommen("sdsdA")
    public void sdsdA() {
    }

    @Wenn("dsA")
    public void dsA() {
    }

    @Dann("sdfsdfA")
    public void sdfsdfA() {
        assertEquals(1, 1);
    }
    @Given("GBDDNew12_6")
    public void GBDDNew12_6() {
    }
    
    @When("WBDDNew12_6")
    public void WBDDNew12_6() {
    }

     @Then("TBDDNew12_6")
    public void TBDDNew12_6() {
         assertEquals(1, 12);
    }
     
    @Given("GBDDNew12_samet")
    public void GBDDNew12_samet() {
    }
    
    @When("WBDDNew12_samet")
    public void WBDDNew12_samet() {
    }

     @Then("TBDDNew12_samet")
    public void TBDDNew12_samet() {
         assertEquals(1, 1);
    }
     @Given("GGG1")
    public void GGG1() {
    }
    
    @When("WWW2")
    public void WWW2() {
    }

     @Then("TTT3")
    public void TTT3() {
         assertEquals(1, 2);
    }
     @Given("BDD2Alis1211GGG")
    public void BDD2Alis1211GGG() {
    }
    
    @When("BDD2Alis1211WWW")
    public void BDD2Alis1211WWW() {
    }

     @Then("BDD2Alis1211TTT")
    public void BDD2Alis1211TTT() {
         assertEquals(1, 1);
    }
     @Given("G1221")
    public void G1221() {
    }
    
    @When("W1221")
    public void W1221() {
    }

     @Then("T1221")
    public void T1221() {
         assertEquals(1, 1);
    }

    @Given("BDDOctane2_28G")
    public void BDDOctane2_28G() {
    }
    
    @When("BDDOctane2_28")
    public void BDDOctane2_28() {
    }
    @Then("BDDOctane2_28T")
    public void BDDOctane2_28T() {
         assertEquals(true);
    }
}
