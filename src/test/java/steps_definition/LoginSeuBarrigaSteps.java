package steps_definition;

import base_class.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.SeuBarrigaHomePage;
import page_objects.SeuBarrigaLoginPage;

public class LoginSeuBarrigaSteps extends BaseSteps {

    SeuBarrigaHomePage paginaInicial = new SeuBarrigaHomePage(browser);
    SeuBarrigaLoginPage paginaLogin = new SeuBarrigaLoginPage(browser);

    @Dado("que o usuario esta na pagina de login do seu barriga")
    public void que_o_usuario_esta_na_pagina_de_login() {
        paginaInicial.abrir();
        paginaInicial.clicarLinkLogin();
        screenshot();
    }

    @Quando("o usuario preencher os campos com {string} e {string}")
    public void o_usuario_preencher_os_campos_e(String email, String senha) {
        paginaLogin.preencherEmail(email);
        paginaLogin.preencherSenha(senha);
        screenshot();
    }

    @Quando("o usuario clicar no botao para \"Entrar\"")
    public void o_usuario_clicar_no_botao() {
        paginaLogin.clicarBtnEntrar();
        screenshot();
    }

    @Entao("o sistema mostra a mensagem de {string}")
    public void o_sistema_mostra_a_mensagem(String msgEsperada) {
        String msgTela = paginaLogin.getMsgAlerta();
        Assert.assertEquals(msgEsperada, msgTela);
        screenshot();
    }

    @Entao("o sistema mostra a mensagem o campo email {string}")
    public void o_sistema_mostra_a_mensagem_o_campo_email(String msgEsperada) {
        String msgTela = paginaLogin.getMsgErroEmail();
        Assert.assertEquals(msgEsperada, msgTela);
        screenshot();
    }

    @Entao("o sistema mostra a mensagem o campo senha {string}")
    public void o_sistema_mostra_a_mensagem_o_campo_senha(String msgEsperada) {
        String msgTela = paginaLogin.getMsgErroSenha();
        Assert.assertEquals(msgEsperada, msgTela);
        screenshot();
    }
}
