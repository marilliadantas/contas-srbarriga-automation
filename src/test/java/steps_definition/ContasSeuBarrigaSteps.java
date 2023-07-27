package steps_definition;

import base_class.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.SeuBarrigaContasPage;
import page_objects.SeuBarrigaHomePage;


public class ContasSeuBarrigaSteps extends BaseSteps {

    SeuBarrigaHomePage paginaInicial = new SeuBarrigaHomePage(browser);
    SeuBarrigaContasPage paginaContas  = new SeuBarrigaContasPage (browser);

    @Dado("que o usuario esta na pagina inicial do Seu Barriga")
    public void queOUsuarioEstaNaPaginaInicialDoSeuBarriga() {
        paginaInicial.abrir();
        screenshot();
    }

    @Quando("o usuario clicar em \"Contas\"")
    public void oUsuarioClicarEmContas() {
        paginaInicial.ClicarLinkContas();
        screenshot();
    }

    @E("o usuario clicar em \"Adicionar\"")
    public void oUsuarioClicarEmAdicionar() {
        paginaInicial.clicarLinkAdicionar();
        screenshot();
    }

    @E("o usuario inserir o nome da conta")
    public void oUsuarioInserirONomeDaConta() {
        paginaContas.preencherNome("Nubank");
        screenshot();
    }

    @E("o usuario clicar em \"Salvar\"")
    public void oUsuarioClicarEm() {
        paginaContas.clicarBtnSalvar();
    }

    @Entao("o sistema deve exibir a mensagem {string}")
    public void oSistemaDeveExibirAMensagem(String msgSucessEsperada) {
        String msgTela = paginaContas.msgAlert();
        Assert.assertEquals(msgSucessEsperada, msgTela);
        screenshot();
    }
}

