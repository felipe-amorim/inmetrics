package produtos.fooddelivery.stepdefs;

import cucumber.api.java.en.When;
import support.Core;

import java.util.Calendar;

import static produtos.fooddelivery.objetos.FoodDeliverySignUp.*;

public class SDFoodDeliverySignUp extends Core {

    @When("O usuario realiza um cadastro")
    public void oUsuarioRealizaUmCadastro() {
        //variavel de tempo em milis para gerar massa dinamica
        long t = Calendar.getInstance().getTimeInMillis();
        click(foodDeliverySignUpImNewButton);
        send(foodDeliverySignUpEmailInput, "a"+t+"@teste.com");
        send(foodDeliverySignUpTelefoneInput, String.valueOf(t));
        send(foodDeliverySignUpSenhaInput, "Senha@123");
        click(foodDeliverySignUpCreateAccountButton);
        click(foodDeliverySignUpToken1Button);
        click(foodDeliverySignUpToken1Button);
        click(foodDeliverySignUpToken1Button);
        click(foodDeliverySignUpToken1Button);
        click(foodDeliverySignUpSubmitCodeButton);
    }
}
