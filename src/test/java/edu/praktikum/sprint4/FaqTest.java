package edu.praktikum.sprint4;

import edu.praktikum.sprint4.pom.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.jar.Manifest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class FaqTest {

    private WebDriver driver;
    private String questionXPath;
    private String answerPath;
    private String expectedAnswer;

    public FaqTest(String questionXPath, String answerPath, String expectedAnswer) {
        this.questionXPath = questionXPath;
        this.answerPath = answerPath;
        this.expectedAnswer = expectedAnswer;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Parameterized.Parameters
    public static Object[][] getAnswers() {
        return new Object[][] {
                {".//div[contains(text(), 'Сколько это стоит?')]", ".//p[contains(text(), 'рублей') and contains(text(), 'Оплата курьеру')]", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {".//div[contains(text(), 'несколько самокатов!')]", ".//p[contains(text(), 'несколько заказов')]", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {".//div[text()='Как рассчитывается время аренды?']", ".//p[contains(text(), 'Отсчёт времени')]", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {".//div[contains(text(), 'прямо на сегодня')]", ".//p[contains(text(), 'с завтрашнего дня')]", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {".//div[contains(text(), 'продлить заказ')]", ".//p[contains(text(), 'если что-то срочное')]", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {".//div[contains(text(), 'зарядку вместе с самокатом')]", ".//p[contains(text(), 'Зарядка')]", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {".//div[contains(text(), 'отменить заказ')]", ".//p[contains(text(), 'пока самокат не привезли')]", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {".//div[contains(text(), 'за МКАДом')]", ".//p[contains(text(), 'Москве') and contains(text(), 'Московской области')]", "Да, обязательно. Всем самокатов! И Москве, и Московской области."}
        };
    }

    @Test
    public void checkAnswerIsVisible() {
        MainPage mainPage = new MainPage(driver);

        mainPage.open()
                .clickAccordionByXPath(questionXPath);
        assertTrue("Элемент не виден на странице", mainPage.checkAnswerIsVisibleByXPath(answerPath));
    }

    @Test
    public void checkAnswerText() {
        MainPage mainPage = new MainPage(driver);

        mainPage.open()
                .clickAccordionByXPath(questionXPath);
        String actualAnswer = mainPage.checkAnswerByXPath(answerPath);
        assertEquals("Ответ не совпадает", expectedAnswer, actualAnswer);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}