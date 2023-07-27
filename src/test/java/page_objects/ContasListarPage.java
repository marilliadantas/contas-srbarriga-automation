package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContasListarPage extends BasePage {
    private By txtResultadoListar = By.cssSelector("#tabelaContas > tbody > tr > td:nth-child(1)");
    private By btnEditar = By.cssSelector("#tabelaContas > tbody > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)");
    private By inputNome = By.cssSelector("#nome");
    private By btnSalvar = By.xpath("/html/body/div[2]/form/div[2]/button");
    private By msgAlert = By.xpath("/html/body/div[1]");
    private By btnRemover = By.cssSelector("#tabelaContas > tbody > tr > td:nth-child(2) > a:nth-child(2)");

    public ContasListarPage(WebDriver _browser) {
        super(_browser);
    }

    public String getLista() {
        String texto = driver.findElement(txtResultadoListar).getText();
        return texto;
    }

    public void clicarBtnEditar(){
        driver.findElement(btnEditar).click();
    }

    public void editarNome(){
        driver.findElement(inputNome).clear();
        driver.findElement(inputNome).sendKeys("C6 Bank");
    }

    public void removerConta(){
        driver.findElement(btnRemover).click();
    }
}

