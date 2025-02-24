package edu.praktikum.sprint4;

import edu.praktikum.sprint4.pom.MainPage;
import edu.praktikum.sprint4.pom.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.junit.Assert.assertTrue;

public class OpenOrderFormTest {
    private WebDriver driver;


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void checkOrderFormAfterClickOrderButtonOnTopExists() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open()
                .clickOrderScooterButtonOnTop();
        OrderPage orderPage = new OrderPage(driver);
        assertTrue("Элемент не виден на странице", orderPage.checkOrderFormExists());
    }

    @Test
    public void checkOrderFormAfterClickOrderButtonOnBottomExists() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open()
                .clickOrderScooterButtonOnBottom();
        OrderPage orderPage = new OrderPage(driver);
        assertTrue("Элемент не виден на странице", orderPage.checkOrderFormExists());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
