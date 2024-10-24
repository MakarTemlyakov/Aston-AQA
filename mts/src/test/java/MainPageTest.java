
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class MainPageTest {
    static WebDriver driver;

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
    }

    @Test
    public void getTitleOfBlock(){
        String expectedTitle = "Онлайн пополнение без комиссии";
        WebElement payBlock = driver.findElement(By.xpath("//section[@class='pay']//h2"));
        String formatedText = payBlock.getText().replaceAll("<br>", "").replaceAll("\\n", " ");

        Assertions.assertEquals(expectedTitle, formatedText);
    }

    @Test
    public void isExistPaymentMethods(){
        List<WebElement> logoImages = driver.findElements(By.xpath("//div[@class='pay__partners']//img"));
        boolean allDisplayed = logoImages.stream().allMatch(WebElement::isDisplayed);

        Assertions.assertTrue(allDisplayed);
    }

    @Test
    public void checkLinkAboutService(){
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        if(link.isDisplayed()) {
           link.click();
        }

        String actualUrl = driver.getCurrentUrl();

        Assertions.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void checkConnectService(){
        String modalActualPaymentInfo= "";
        String modalActualPrice = "";
        WebElement form = driver.findElement(By.xpath("//div[@class='pay__form']"));
        WebElement selectButton = form.findElement(By.xpath("//button[@class='select__header']"));
        WebElement selectedService = form.findElement(By.xpath("//span[@class='select__now']"));
        WebElement phoneInput = form.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement sumInput = form.findElement(By.xpath("//input[@id='connection-sum']"));
        WebElement button = form.findElement(By.xpath("//button[contains(@class,'button__default')]"));

        if(selectButton.isDisplayed()) {
            selectButton.click();
        }

        WebElement optionList = form.findElement(By.xpath("//ul[@class='select__list']"));
        if(optionList.isDisplayed()){
            WebElement item = optionList.findElement(By.xpath("//p[@class='select__option' and text()='Услуги связи']"));
            item.click();
        }

        sumInput.sendKeys("300");
        phoneInput.sendKeys("297777777");

        if(button.isDisplayed()){
            button.click();
        }

        WebElement iframe = driver.findElement(By.className("bepaid-iframe"));
        driver.switchTo().frame(iframe);
        WebElement modal = driver.findElement(By.xpath("//div[@class='app-wrapper']"));

        if(modal.isDisplayed()) {
            WebElement modalPrice = modal.findElements(By.xpath("//div[@class='pay-description__cost']//span")).get(0);
            WebElement modalPaymentInfo = modal.findElements(By.xpath("//div[@class='pay-description__text']//span")).get(0);
            modalActualPaymentInfo =  modalPaymentInfo.getText();
            modalActualPrice = modalPrice.getText();
        }

        driver.switchTo().defaultContent();

        Assertions.assertEquals("300.00 BYN", modalActualPrice);
        Assertions.assertEquals("Оплата: Услуги связи Номер:375297777777", modalActualPaymentInfo);
        Assertions.assertEquals("Услуги связи", selectedService.getText());
    }
}
