package edu.praktikum.sprint4;

import edu.praktikum.sprint4.pom.OrderPage;
import edu.praktikum.sprint4.utils.Utils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderScooterTest {

    private WebDriver driver;
    private static final String PHONENUMBER = Utils.getRandomPhone();
    private final String name;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String phoneNumber;
    private final String deliveryDate;
    private final String comment;
    private final boolean isVisible;

    public OrderScooterTest (String name, String lastName, String address, String metroStation, String phoneNumber,
                             String deliveryDate, String comment, boolean isVisible) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.deliveryDate = deliveryDate;
        this.comment = comment;
        this.isVisible = isVisible;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Parameterized.Parameters
    public static Object[][] getInputs() {
        return new Object[][]{
                {"Вячеслав", "Голангов", "Бульвар Автоматизаторов", "Лубянка", PHONENUMBER, "2025-03-01", "Привезите, пожалуйста", true},
                {"Никита", "Сишарпин", "Тестовый проспект", "Фрунзенская", PHONENUMBER, "2025-03-02", "Позвонить за 1.5 часа до выезда", true},
                {"Ольга", "Джава", "Площадь покрытия тестированием", "Аэропорт", PHONENUMBER, "2025-03-03", "", true}
            };
        }

    @Test
    public void orderGreyScooterForTest() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.open();
        orderPage.fillForWhomScooterForm(name, lastName, address, metroStation, phoneNumber);
        orderPage.fillAboutRentForm(deliveryDate, comment);
        orderPage.openRentalPeriodList();
        orderPage.chooseFiveDaysRent()
                 .chooseGreyColor();
        orderPage.clickOrderButtonUnderInputs()
                 .clickApproveOrder();
        assertTrue("Информации об успешности заказа нет", orderPage.checkOrderedTopicExists());
    }

    @Test
    public void orderBlackScooterForTest() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.open();
        orderPage.fillForWhomScooterForm(name, lastName, address, metroStation, phoneNumber);
        orderPage.fillAboutRentForm(deliveryDate, comment);
        orderPage.openRentalPeriodList();
        orderPage.chooseOneDayRent()
                 .chooseBlackColor();
        orderPage.clickOrderButtonUnderInputs()
                 .clickApproveOrder();
        assertTrue("Информации об успешности заказа нет", orderPage.checkOrderedTopicExists());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
