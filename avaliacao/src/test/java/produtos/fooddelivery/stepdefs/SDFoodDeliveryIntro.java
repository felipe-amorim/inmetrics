package produtos.fooddelivery.stepdefs;

import cucumber.api.java.en.And;
import support.Core;

import static produtos.fooddelivery.objetos.FoodDeliveryIntro.*;

public class SDFoodDeliveryIntro extends Core {
    @And("O usuario pula a introducao")
    public void oUsuarioPulaAIntroducao() {
        click(foodDeliveryIntroSkipButton);
    }

    @And("O usuario passa pela introducao")
    public void oUsuarioPassaPelaIntroducao() {
        click(foodDeliveryIntroNextButton);
        click(foodDeliveryIntroNextButton);
        click(foodDeliveryIntroNextButton);
        click(foodDeliveryIntroNextButton);
    }
}
