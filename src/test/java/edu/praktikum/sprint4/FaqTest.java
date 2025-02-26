package edu.praktikum.sprint4;

import edu.praktikum.sprint4.pom.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FaqTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void checkAnswerOnCostAndPaymentQuestionIsVisible() {
        MainPage mainPage  = new MainPage(driver);

        mainPage.open()
                .clickCostAndPaymentQuestionAccordion();
        assertTrue("Элемент не виден на странице", mainPage.checkAnswerOnCostAndPaymentQuestionIsVisible());
    }

    @Test
    public void checkAnswerOnCostAndPaymentQuestion() {
        MainPage mainpage = new MainPage(driver);

        mainpage.open()
                .clickCostAndPaymentQuestionAccordion();
        String expectedAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actualAnswer = mainpage.checkAnswerOnCostAndPaymentQuestion();
        assertEquals("Ответ не совпадает", actualAnswer, expectedAnswer);
    }

    @Test
    public void checkAnswerOnOrderSeveralScootersIsVisible() {
        MainPage mainPage  = new MainPage(driver);

        mainPage.open()
                .clickOrderSeveralScootersQuestionAccordion();
        assertTrue("Элемент не виден на странице", mainPage.checkAnswerOnOrderSeveralScootersIsVisible());
    }

    @Test
    public void checkAnswerOnOrderSeveralScooters() {
        MainPage mainpage = new MainPage(driver);

        mainpage.open()
                .clickOrderSeveralScootersQuestionAccordion();
        String expectedAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, " +
                "можете просто сделать несколько заказов — один за другим.";
        String actualAnswer = mainpage.checkAnswerOnOrderSeveralScooters();
        assertEquals("Ответ не совпадает", actualAnswer, expectedAnswer);
    }

    @Test
    public void checkAnswerCalcOrderTimeIsVisible() {
        MainPage mainPage  = new MainPage(driver);

        mainPage.open()
                .clickCalcOrderTimeQuestionAccordion();
        assertTrue("Элемент не виден на странице", mainPage.checkAnswerCalcOrderTimeIsVisible());
    }

    @Test
    public void checkAnswerCalcOrderTime() {
        MainPage mainpage = new MainPage(driver);

        mainpage.open()
                .clickCalcOrderTimeQuestionAccordion();
        String expectedAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат " +
                "8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actualAnswer = mainpage.checkAnswerCalcOrderTime();
        assertEquals("Ответ не совпадает", actualAnswer, expectedAnswer);
    }

    @Test
    public void checkAnswerOnOrderScooterTodayIsVisible() {
        MainPage mainPage  = new MainPage(driver);
        mainPage.open()
                .clickOrderScooterTodayQuestionAccordion();
        assertTrue("Элемент не виден на странице", mainPage.checkAnswerOnOrderScooterTodayIsVisible());
    }

    @Test
    public void checkAnswerOnOrderScooterToday() {
        MainPage mainpage = new MainPage(driver);
        mainpage.open()
                .clickOrderScooterTodayQuestionAccordion();
        String expectedAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actualAnswer = mainpage.checkAnswerOnOrderScooterToday();
        assertEquals("Ответ не совпадает", actualAnswer, expectedAnswer);
    }

    @Test
    public void checkAnswerOnIncreaseOrDecreaseOrderTimeIsVisible() {
        MainPage mainPage  = new MainPage(driver);
        mainPage.open()
                .clickIncreaseOrDecreaseOrderTimeAccordion();
        assertTrue("Элемент не виден на странице", mainPage.checkAnswerOnIncreaseOrDecreaseOrderTimeIsVisible());
    }

    @Test
    public void checkAnswerOnIncreaseOrDecreaseOrderTime() {
        MainPage mainpage = new MainPage(driver);

        mainpage.open()
                .clickIncreaseOrDecreaseOrderTimeAccordion();
        String expectedAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actualAnswer = mainpage.checkAnswerOnIncreaseOrDecreaseOrderTime();
        assertEquals("Ответ не совпадает", actualAnswer, expectedAnswer);
    }

    @Test
    public void checkAnswerOnBringingChargerIsVisible() {
        MainPage mainPage  = new MainPage(driver);

        mainPage.open()
                .clickBringingChargerQuestionAccordion();
        assertTrue("Элемент не виден на странице", mainPage.checkAnswerOnBringingChargerIsVisible());
    }

    @Test
    public void checkAnswerOnBringingCharger() {
        MainPage mainpage = new MainPage(driver);

        mainpage.open()
                .clickBringingChargerQuestionAccordion();
        String expectedAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если " +
                "будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actualAnswer = mainpage.checkAnswerOnBringingCharger();
        assertEquals("Ответ не совпадает", actualAnswer, expectedAnswer);
    }

    @Test
    public void checkAnswerOnCancelOrderIsVisible() {
        MainPage mainPage  = new MainPage(driver);

        mainPage.open()
                .clickCancelOrderQuestionAccordion();
        assertTrue("Элемент не виден на странице", mainPage.checkAnswerOnCancelOrderIsVisible());
    }

    @Test
    public void checkAnswerOnCancelOrder() {
        MainPage mainpage = new MainPage(driver);

        mainpage.open()
                .clickCancelOrderQuestionAccordion();
        String expectedAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. " +
                "Все же свои.";
        String actualAnswer = mainpage.checkAnswerOnCancelOrder();
        assertEquals("Ответ не совпадает", actualAnswer, expectedAnswer);
    }

    @Test
    public void checkAnswerOnBringingScooterBeyondMRRIsVisible() {
        MainPage mainPage  = new MainPage(driver);

        mainPage.open()
                .clickBringingScooterBeyondMRRQuestionAccordion();
        assertTrue("Элемент не виден на странице", mainPage.checkAnswerOnBringingScooterBeyondMRRIsVisible());
    }

    @Test
    public void checkAnswerOnBringingScooterBeyondMRR() {
        MainPage mainpage = new MainPage(driver);
        mainpage.open()
                .clickBringingScooterBeyondMRRQuestionAccordion();
        String expectedAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actualAnswer = mainpage.checkAnswerOnBringingScooterBeyondMRR();
        assertEquals("Ответ не совпадает", actualAnswer, expectedAnswer);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}