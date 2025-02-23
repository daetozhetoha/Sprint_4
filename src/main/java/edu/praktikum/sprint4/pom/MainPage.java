package edu.praktikum.sprint4.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";

    //Вопрос о стоимости и способе оплаты
    By questionAboutCostAndPaymentAccordion = By.xpath(".//div[contains(text(), 'Сколько это стоит?')]");

    //Ответ на вопрос о стоимости и способе оплаты
    By answerOnCostAndPayment = By.xpath(".//p[contains(text(), 'рублей') and contains(text(), 'Оплата курьеру')]");

    //Вопрос о возможности арендовать несколько самокатов
    By questionAboutOrderSeveralScootersAccordion = By.xpath(".//div[contains(text(), 'несколько самокатов!')]");

    //Ответ на вопрос о возможности арендовать несколько самокатов
    By answerOnOrderSeveralScooters = By.xpath(".//p[contains(text(), 'несколько заказов')]");

    //Вопрос о расчете времени аренды
    By questionAboutCalcOrderTimeAccordion = By.xpath(".//div[text()='Как рассчитывается время аренды?']");

    //Ответ на вопрос о расчете времени аренды
    By answerOnCalcOrderTime = By.xpath(".//p[contains(text(), 'Отсчёт времени')]");

    //Вопрос о возможности заказать самокат прямо на сегодня
    By questionAboutOrderScooterTodayAccordion = By.xpath(".//div[contains(text(), 'прямо на сегодня')]");

    //Ответ на вопрос о возможности заказать самокат прямо на сегодня
    By answerOnOrderScooterToday = By.xpath(".//p[contains(text(), 'с завтрашнего дня')]");

    //Вопрос о возможности продлить заказ или вернуть самокат раньше
    By questionAboutIncreaseOrDecreaseOrderTimeAccordion = By.xpath(".//div[contains(text(), 'продлить заказ')]");

    //Ответ на вопрос о возможности продлить заказ или вернуть самокат раньше
    By answerOnIncreaseOrDecreaseOrderTime = By.xpath(".//p[contains(text(), 'если что-то срочное')]");

    //Вопрос о том, привозят ли зарядку вместе с самокатом
    By questionAboutBringingChargerAccordion = By.xpath(".//div[contains(text(), 'зарядку вместе с самокатом')]");

    //Ответ на вопрос о том, привозят ли зарядку вместе с самокатом
    By answerOnBringingCharger = By.xpath(".//p[contains(text(), 'Зарядка')]");

    //Вопрос о возможности отмены заказа
    By questionAboutCancelOrderAccordion = By.xpath(".//div[contains(text(), 'отменить заказ')]");

    //Ответ на вопрос о возможности отмены заказа
    By answerOnCancelOrder = By.xpath(".//p[contains(text(), 'пока самокат не привезли')]");

    //Вопрос о возможности привезти самокат за МКАД
    By questionAboutBringingScooterBeyondMRRAccordion = By.xpath(".//div[contains(text(), 'за МКАДом')]");

    //Ответ на вопрос о возможности привезти самокат за МКАД
    By answerOnBringingScooterBeyondMRR = By.xpath(".//p[contains(text(), 'Москве') and contains(text(), 'Московской области')]");

    //Кнопка "Заказать" вверху страницы
    By orderScooterButtonOnTop = By.className("Button_Button__ra12g");

    //Кнопка "Заказать" внизу страницы
    By orderScooterButtonOnBottom = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage open() {
        driver.get(URL);
        return this;
    }
    public MainPage clickCostAndPaymentQuestionAccordion() {
        WebElement element = driver.findElement(questionAboutCostAndPaymentAccordion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }
    public boolean checkAnswerOnCostAndPaymentQuestionIsVisible() {
        return driver.findElement(answerOnCostAndPayment).isDisplayed();
    }
    public String checkAnswerOnCostAndPaymentQuestion() {
        return driver.findElement(answerOnCostAndPayment).getText();
    }
    public MainPage clickOrderSeveralScootersQuestionAccordion() {
        WebElement element = driver.findElement(questionAboutOrderSeveralScootersAccordion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }
    public boolean checkAnswerOnOrderSeveralScootersIsVisible() {
        return driver.findElement(answerOnOrderSeveralScooters).isDisplayed();
    }
    public String checkAnswerOnOrderSeveralScooters() {
        return driver.findElement(answerOnOrderSeveralScooters).getText();
    }
    public MainPage clickCalcOrderTimeQuestionAccordion() {
       WebElement element = driver.findElement(questionAboutCalcOrderTimeAccordion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }
    public boolean checkAnswerCalcOrderTimeIsVisible() {
        return driver.findElement(answerOnCalcOrderTime).isDisplayed();
    }
    public String checkAnswerCalcOrderTime(){
        return driver.findElement(answerOnCalcOrderTime).getText();
    }
    public MainPage clickOrderScooterTodayQuestionAccordion() {
        WebElement element = driver.findElement(questionAboutOrderScooterTodayAccordion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }
    public boolean checkAnswerOnOrderScooterTodayIsVisible() {
        return driver.findElement(answerOnOrderScooterToday).isDisplayed();
    }
    public String checkAnswerOnOrderScooterToday() {
        return driver.findElement(answerOnOrderScooterToday).getText();
    }
    public MainPage clickIncreaseOrDecreaseOrderTimeAccordion() {
        WebElement element = driver.findElement(questionAboutIncreaseOrDecreaseOrderTimeAccordion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }
    public boolean checkAnswerOnIncreaseOrDecreaseOrderTimeIsVisible() {
        return driver.findElement(answerOnIncreaseOrDecreaseOrderTime).isDisplayed();
    }
    public String checkAnswerOnIncreaseOrDecreaseOrderTime() {
        return driver.findElement(answerOnIncreaseOrDecreaseOrderTime).getText();
    }
    public MainPage clickBringingChargerQuestionAccordion() {
        WebElement element = driver.findElement(questionAboutBringingChargerAccordion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }
    public boolean checkAnswerOnBringingChargerIsVisible() {
        return driver.findElement(answerOnBringingCharger).isDisplayed();
    }
    public String checkAnswerOnBringingCharger() {
        return driver.findElement(answerOnBringingCharger).getText();
    }
    public MainPage clickCancelOrderQuestionAccordion() {
        WebElement element = driver.findElement(questionAboutCancelOrderAccordion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }
    public boolean checkAnswerOnCancelOrderIsVisible() {
        return driver.findElement(answerOnCancelOrder).isDisplayed();
    }
    public String checkAnswerOnCancelOrder() {
        return driver.findElement(answerOnCancelOrder).getText();
    }
    public MainPage clickBringingScooterBeyondMRRQuestionAccordion() {
        WebElement element = driver.findElement(questionAboutBringingScooterBeyondMRRAccordion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }
    public boolean checkAnswerOnBringingScooterBeyondMRRIsVisible() {
        return driver.findElement(answerOnBringingScooterBeyondMRR).isDisplayed();
    }
    public String checkAnswerOnBringingScooterBeyondMRR() {
        return driver.findElement(answerOnBringingScooterBeyondMRR).getText();
    }
    public void clickOrderScooterButtonOnTop() {
        driver.findElement(orderScooterButtonOnTop).click();
    }
    public void clickOrderScooterButtonOnBottom() {
        WebElement element = driver.findElement(orderScooterButtonOnBottom);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }
}
