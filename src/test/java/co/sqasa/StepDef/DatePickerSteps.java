package co.sqasa.StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerSteps {

    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("que el usuario abre el Datepicker de jQuery")
    public void que_el_usuario_abre_el_datepicker_de_jquery() {
        driver.get("https://jqueryui.com/datepicker/");
        WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("datepicker")).click();
    }

    @When("selecciona el dia {string} del mes {string} del anio {string}")
    public void selecciona_el_dia_del_mes_del_anio(String dia, String mes, String anio) {
        String esperado = mes + " " + anio;

        WebElement titulo = driver.findElement(By.cssSelector(".ui-datepicker-title"));
        String actual = titulo.getText();

        int maxIntentos = 24;
        while (!actual.equalsIgnoreCase(esperado) && maxIntentos-- > 0) {
            driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
            titulo = driver.findElement(By.cssSelector(".ui-datepicker-title"));
            actual = titulo.getText();
        }

        WebElement diaElemento = driver.findElement(
                By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//a[text()='" + dia + "']")
        );
        diaElemento.click();
    }

    @Then("la fecha seleccionada debe mostrarse en el campo de fecha")
    public void la_fecha_seleccionada_debe_mostrarse_en_el_campo_de_fecha() {
        WebElement input = driver.findElement(By.id("datepicker"));
        String valor = input.getAttribute("value");
        Assert.assertTrue("La fecha no se muestra en el campo", valor.contains("/"));
    }
}

