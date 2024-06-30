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


public class ClickProfile {


    private WebDriver driver2;
    Task1 task1 = new Task1();

    @Test
    public void Test1() {
        ChromeOptions options2 = new ChromeOptions();
        options2.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver2 = new ChromeDriver(options2);
        driver2.get("https://qa-mesto.praktikum-services.ru/");
        task1.inputLogin(driver2);
        new WebDriverWait(driver2, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
        driver2.findElement(By.cssSelector("#root > div > main > section.profile.page__section > div.profile__image")).click();
        driver2.findElement(By.xpath("//*[@id=\"owner-avatar\"]")).sendKeys("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/avatarSelenium.png");
        driver2.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/form/button[2]")).click();


    }

    @After
    public void tearDown2() {
        this.driver2.quit();
    }
}