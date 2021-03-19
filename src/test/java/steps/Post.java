package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post  extends Base {
    private Base base;

    public Post(Base base) {
        this.base = base;
    }
/*
    @Dado("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url);
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto){
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

    }

    @Entao("^Exibe a expresao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpresaoNoTituloDaGuia(String produto){
        assertTrue(base.driver.getTitle().contains(produto));

    }
*/
    @Given("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url);
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto){
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

    }

    @Then("^Exibe a expresao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpresaoNoTituloDaGuia(String produto){
        assertTrue(base.driver.getTitle().contains(produto));

    }
}
