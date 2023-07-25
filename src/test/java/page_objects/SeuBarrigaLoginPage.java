package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeuBarrigaLoginPage extends BasePage {
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnEntrar = By.xpath("/html/body/div[2]/form/button");
    private By msgAlerta = By.xpath("//div[@role='alert']");
    private By msgErroEmail = By.xpath("//div[@role='alert'][1]");
    private By msgErroSenha = By.xpath("//div[@role='alert'][2]");

    public SeuBarrigaLoginPage(WebDriver _browser) {
        super(_browser);
    }

    public void preencherEmail(String email) {
        waitElementVisible(inputEmail,5);
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        driver.findElement(inputSenha).sendKeys(senha);
    }

    public void clicarBtnEntrar() {
        driver.findElement(btnEntrar).click();
    }

    public String getMsgAlerta() {
        waitElementVisible(msgAlerta, 5);
        return driver.findElement(msgAlerta).getText();
    }

    public String getMsgErroEmail(){
        waitElementVisible(msgErroEmail, 5);
        return driver.findElement(msgErroEmail).getText();
    }
    public String getMsgErroSenha(){
        waitElementVisible(msgErroSenha, 5);
        return driver.findElement(msgErroSenha).getText();
    }
}
