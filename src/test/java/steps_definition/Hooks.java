package steps_definition;

import base_class.BaseSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import page_objects.SeuBarrigaHomePage;

import static base_class.BaseSteps.screenshot;

public class Hooks {
    @Before
    public void BeforeAllScenario(Scenario _scenario) {
        BaseSteps.scenario = _scenario;
    }

    @After
    public void AfterAllScenario() {
        if (BaseSteps.scenario.isFailed()) {
            screenshot();
        }
    }
    @Before("@area_logada")
    public void logar(Scenario _scenario){
        BaseSteps.scenario = _scenario;
        LoginSeuBarrigaSteps stepsLogin = new LoginSeuBarrigaSteps();
        stepsLogin.que_o_usuario_esta_na_pagina_de_login();
        stepsLogin.o_usuario_preencher_os_campos_e("mickhill@test-24-jul-2023-11-56-10", "1234");
        stepsLogin.o_usuario_clicar_no_botao();
        stepsLogin.o_sistema_mostra_a_mensagem("Bem vindo, Mick Hill 24-jul-2023-11-56-10!");
    }
    @After("@area_logada")
    public void deslogar(){
        SeuBarrigaHomePage paginaInicial = new SeuBarrigaHomePage(BaseSteps.browser);
        paginaInicial.clicarLinkSair();
    }
}
