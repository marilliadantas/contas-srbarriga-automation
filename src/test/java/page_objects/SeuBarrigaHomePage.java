package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeuBarrigaHomePage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me";
    private By linkLogin = By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[1]/a");
    private By linkCadastro = By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[2]/a");
    private By linkSair = By.xpath("//*[@id='navbar']/ul/li[5]/a");
    private By linkContas = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a");
    private By linkAdicionar = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a");
    private By btnListar = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[2]/a");;

    public SeuBarrigaHomePage(WebDriver _browser) {
        super(_browser);
    }

    public void abrir() {
        driver.get(url);
    }

    public void clicarLinkCadastro() {
        driver.findElement(linkCadastro).click();
    }

    public void clicarLinkLogin(){
        waitElementVisible(linkLogin,5);
        driver.findElement(linkLogin).click();
    }

    public void clicarLinkSair(){
        waitElementVisible(linkSair,1);
        driver.findElement(linkSair).click();
    }

    public void ClicarLinkContas(){
        waitElementVisible(linkContas,1);
        driver.findElement(linkContas).click();
    }

    public void clicarLinkAdicionar(){
        waitElementVisible(linkAdicionar,1);
        driver.findElement(linkAdicionar).click();
    }

    public void clicarBtnListar(){
        waitElementVisible(btnListar,1);
        driver.findElement(btnListar).click();
    }
}
