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

public class Edit {

    private WebDriver driver;
    Task1 task1 = new Task1();

    @Test
    public void test5() {
        ChromeOptions options2 = new ChromeOptions();
        options2.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options2);
        driver.get("https://qa-mesto.praktikum-services.ru/");
        task1.inputLogin(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
        driver.findElement(By.className("profile__edit-button")).click();
        driver.findElement(By.id("owner-name")).sendKeys("this is new name");
        driver.findElement(By.id("owner-description")).sendKeys("QAQ");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/button[2]")).click();


    }

    @After
    public void tearDown() {
        this.driver.quit();
    }


}
