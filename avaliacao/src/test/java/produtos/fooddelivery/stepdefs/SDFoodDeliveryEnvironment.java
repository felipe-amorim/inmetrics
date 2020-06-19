package produtos.fooddelivery.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import support.Core;

public class SDFoodDeliveryEnvironment extends Core {

    @Given("O usuario acessa o aplicativo fooddelivery")
    public void oUsuarioAcessaOAplicativoFooddelivery() {
        instantiateAppium();
    }

    @And("O usuario encerra o aplicativo")
    public void oUsuarioEncerraOAplicativo() {
        killAppium();
    }
}
