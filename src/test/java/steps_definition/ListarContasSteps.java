package steps_definition;

import base_class.BaseSteps;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.ContasListarPage;
import page_objects.SeuBarrigaHomePage;

public class ListarContasSteps extends BaseSteps {

    SeuBarrigaHomePage paginaInicial = new SeuBarrigaHomePage(browser);
    ContasListarPage ContasListar = new ContasListarPage(browser);

    @Quando("o usuario clicar no botao contas")
    public void oUsuarioClicarNoBotaoContas() {
        paginaInicial.ClicarLinkContas();
        screenshot();
    }

    @E("o usuario clicar no botao listar")
    public void oUsuarioClicarNoBotaoListar() {
        paginaInicial.clicarBtnListar();
        screenshot();
    }

    @Entao("o sistema deve exibir a conta {string}")
    public void oSistemaDeveExibirAConta(String msgEsperada) {
        String msgTela = ContasListar.getLista();
        Assert.assertEquals(msgEsperada, msgTela);
        screenshot();
    }

    @Quando("o usuario clicar em editar")
    public void oUsuarioClicarEmEditar() {
        ContasListar.clicarBtnEditar();
    }

    @Entao("o usuario alterar o nome da conta")
    public void oUsuarioAlterarONomeDaConta() {
        ContasListar.editarNome();
        screenshot();
    }

    @Quando("o usuario clicar em remover conta")
    public void oUsuarioClicarEmRemoverConta() {
        ContasListar.removerConta();
    }
}
