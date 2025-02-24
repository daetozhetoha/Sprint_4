package edu.praktikum.sprint4.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;
    private static final String URL = "https://qa-scooter.praktikum-services.ru/order";

    //Поле ввода имени
    By inputName = By.xpath(".//input[@placeholder='* Имя']");

    //Первая страница заказа самоката - заголовок "Для кого самокат"
    By orderHeader = By.className("Order_Header__BZXOb");

    //Поле ввода фамилии
    By inputLastName = By.xpath(".//input[@placeholder='* Фамилия']");

    //Поле ввода адреса
    By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    //Поле выбора метро
    By searchMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");

    //Значение станции метро из списка
    By metroStationFromList = By.className("Order_Text__2broi");

    //Поле ввода номера телефона
    By inputPhoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //Кнопка "Далее" в форме заказа
    By nextButton = By.xpath(".//button[text()='Далее']");

    //Поле выбора даты привоза самоката
    By inputDeliveryDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //Введенная дата привоза самоката для выбора
    By enteredDateInCalendar = By.cssSelector(".react-datepicker__day--selected");

    //Поле указания срока аренды самоката
    By inputRentalPeriod = By.className("Dropdown-placeholder");

    //Сутки аренды самоката
    By oneDayRent = By.xpath(".//div[text()='сутки']");;

    //Двое суток аренды самоката
    By twoDaysRent = By.xpath(".//div[text()='двое суток']");

    //Трое суток аренды самоката
    By threeDaysRent = By.xpath(".//div[text()='трое суток']");

    //Четверо суток аренды самоката
    By fourDaysRent = By.xpath(".//div[text()='четверо суток']");

    //Пятеро суток аренды самоката
    By fiveDaysRent = By.xpath(".//div[text()='пятеро суток']");

    //Шестеро суток аренды самоката
    By sixDaysRent = By.xpath(".//div[text()='шестеро суток']");

    //Семеро суток аренды самоката
    By sevenDaysRent = By.xpath(".//div[text()='семеро суток']");

    //Чек-бокс "черный жемчуг"
    By blackPearlColor = By.id("black");

    //Чек-бокс "серая безысходность"
    By greyHopelessnessColor = By.id("grey");

    //Поле с комментарием для курьера
    By commentForCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    //Кнопка Заказать под блоком с заполнением данных
    By orderButtonUnderInputs = By.xpath(".//div[@class='Order_Buttons__1xGrp']//button[text()='Заказать']");

    //Кнопка Назад
    By goBackButton = By.xpath(".//button[text()='Назад']");

    //Кнопка "Да" в окне "Хотите оформить заказ?"
    By yesButton = By.xpath(".//button[text()='Да']");

    //Кнопка "Нет" в окне "Хотите оформить заказ?"
    By noButton = By.xpath(".//button[text()='Нет']");

    //Заголовок модального окна "Заказ оформлен"
    By orderedTopic = By.xpath(".//div[text()='Заказ оформлен']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public OrderPage open() {
        driver.get(URL);
        return this;
    }
    public OrderPage inputName(String name) {
         driver.findElement(inputName).sendKeys(name);
         return this;
    }
    public OrderPage inputLastname(String lastName) {
        driver.findElement(inputLastName).sendKeys(lastName);
        return this;
    }
    public OrderPage inputAddress(String address) {
        driver.findElement(inputAddress).sendKeys(address);
        return this;
    }
    public OrderPage inputMetroStation(String metroStation) {
        driver.findElement(searchMetroStation).sendKeys(metroStation);
        return this;
    }
    public OrderPage approveMetroStation() {
        driver.findElement(metroStationFromList).click();
        return this;
    }
    public OrderPage inputPhoneNumber(String phoneNumber) {
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
        return this;
    }
    public OrderPage clickNextButton() {
        driver.findElement(nextButton).click();
        return this;
    }
    public OrderPage inputDeliveryDate(String date) {
        driver.findElement(inputDeliveryDate).sendKeys(date);
        return this;
    }
    public OrderPage approveDate() {
        driver.findElement(enteredDateInCalendar).click();
        return this;
    }
    public OrderPage openRentalPeriodList() {
        driver.findElement(inputRentalPeriod).click();
        return this;
    }
    public OrderPage chooseOneDayRent() {
        driver.findElement(oneDayRent).click();
        return this;
    }
    public OrderPage chooseTwoDaysRent() {
        driver.findElement(twoDaysRent).click();
        return this;
    }
    public OrderPage chooseThreeDaysRent() {
        driver.findElement(threeDaysRent).click();
        return this;
    }
    public OrderPage chooseFourDaysRent() {
        driver.findElement(fourDaysRent).click();
        return this;
    }
    public OrderPage chooseFiveDaysRent() {
        driver.findElement(fiveDaysRent).click();
        return this;
    }
    public OrderPage chooseSixDaysRent() {
        driver.findElement(sixDaysRent).click();
        return this;
    }
    public OrderPage chooseSevenDaysRent() {
        driver.findElement(sevenDaysRent).click();
        return this;
    }
    public OrderPage chooseBlackColor() {
        driver.findElement(blackPearlColor).click();
        return this;
    }
    public OrderPage chooseGreyColor() {
        driver.findElement(greyHopelessnessColor).click();
        return this;
    }
    public OrderPage inputCommentForCourier(String comment) {
        driver.findElement(commentForCourier).sendKeys(comment);
        return this;
    }
    public OrderPage clickOrderButtonUnderInputs() {
        driver.findElement(orderButtonUnderInputs).click();
        return this;
    }
    public OrderPage clickApproveOrder() {
        driver.findElement(yesButton).click();
        return this;
    }
    public OrderPage clickGoBackButton() {
        driver.findElement(goBackButton).click();
        return this;
    }
    public OrderPage disapproveOrder() {
        driver.findElement(noButton);
        return this;
    }
    public void fillForWhomScooterForm(String name, String lastName, String address, String metroStation,
                                            String phoneNumber) {
        inputName(name);
        inputLastname(lastName);
        inputAddress(address);
        inputMetroStation(metroStation);
        approveMetroStation();
        inputPhoneNumber(phoneNumber);
        clickNextButton();

    }
    public void fillAboutRentForm(String deliveryDate, String comment) {
        inputDeliveryDate(deliveryDate);
        approveDate();
        inputCommentForCourier(comment);
    }
    public boolean checkOrderFormExists() {
        return driver.findElement(orderHeader).isDisplayed();
    }
    public boolean checkOrderedTopicExists() {
        return driver.findElement(orderedTopic).isDisplayed();
    }

}
