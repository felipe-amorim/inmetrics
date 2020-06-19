package produtos.fooddelivery.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import support.Core;

import static produtos.fooddelivery.objetos.FoodDeliveryMain.foodDeliveryMainCategoriasText;

public class SDFoodDeliveryMain extends Core {

    @Then("O usuario confirma o login")
    public void oUsuarioConfirmaOLogin() {
        click(foodDeliveryMainCategoriasText);
    }


}
