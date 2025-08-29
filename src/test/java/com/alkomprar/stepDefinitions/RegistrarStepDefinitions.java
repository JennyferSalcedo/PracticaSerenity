package com.alkomprar.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistrarStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abre la pagina de alkomprar y pulsa el boton de mi cuenta")
    public void queElUsuarioAbreLaPaginaDeAlkomprarYPulsaElBotonDeMiCuenta() {
        String targetUrl = "https://www.alkomprar.com/";
        OnStage.theActorCalled("Usuario").wasAbleTo(Open.url( "https://www.alkomprar.com/"));
    }

    @Cuando("el usuario ingresa sus datos de registro")
    public void elUsuarioIngresaSusDatosDeRegistro() {

    }

    @Entonces("vera la información de usuario en pantalla")
    public void veraLaInformacionDeUsuarioEnPantalla() {

    }
}


