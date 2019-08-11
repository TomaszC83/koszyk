package pl.sda.automationpractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class dodawanieDoKoszyka {


    @Test
    public void dodajProduktDoKoszyka() {
        System.setProperty("webdriver.chrome.driver", "E:\\Tomek\\praca - Tomek\\skolenie tester oprogramowania/chromedriver.exe");

        ChromeDriver przegladarka = new ChromeDriver();
        przegladarka.manage().window().setSize(new Dimension(1024, 768));
        przegladarka.get("http://automationpractice.com");
        List<WebElement> listaProduktow = przegladarka.findElements(By.cssSelector("#homefeatured .ajax_add_to_cart_button"));

        Actions actions = new Actions(przegladarka);
        actions.moveToElement(listaProduktow.get(4)).perform();


        listaProduktow.get(4).click();

    }
}
