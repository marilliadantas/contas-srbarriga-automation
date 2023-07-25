package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeuBarrigaContasPage extends BasePage {
    private By inputNomeDaConta = By.cssSelector("#nome");
    private By btnSalvar = By.xpath("/html/body/div[2]/form/div[2]/button");
    private By msgAlert = By.xpath("/html/body/div[1]");

    public SeuBarrigaContasPage(WebDriver browser) {
        super(browser);
    }

    public void preencherNome(String nomeDaConta){
        driver.findElement(inputNomeDaConta).sendKeys(nomeDaConta);
        // driver.findElement(inputNomeDaConta).clear();
    }

    public void clicarBtnSalvar(){
        driver.findElement(btnSalvar).click();
    }

    public String msgAlert() {
        return driver.findElement(msgAlert).getText();
    }
}
