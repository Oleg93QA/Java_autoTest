package Ya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class AddAndDeleteNewCard {


    private WebDriver driver3;
    Task1 task1 = new Task1();

    @Test
    public void test3() {

        ChromeOptions options2 = new ChromeOptions();
        options2.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver3 = new ChromeDriver(options2);
        driver3.get("https://qa-mesto.praktikum-services.ru/");
        task1.inputLogin(driver3);
        new WebDriverWait(driver3, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
        driver3.findElement(By.className("profile__add-button")).click();

        driver3.findElement(By.name("name")).sendKeys("Moscow23");
        driver3.findElement(By.name("link")).sendKeys("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenide.png");

        driver3.findElement(By.cssSelector("#root > div > div.popup.popup_type_new-card.popup_is-opened > div > form > button.button.popup__button")).click();

        new WebDriverWait(driver3, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));

        driver3.findElement(By.xpath(".//button[@class='card__delete-button card__delete-button_visible']")).click();
    }


    @After
    public void tearDown() {
        this.driver3.quit();
    }

}
