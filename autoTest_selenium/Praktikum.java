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

public class Praktikum {

    private WebDriver driver;

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/");

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mironov1993@bk.ru");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("524861");
        driver.findElement(By.xpath(".//button[@class='auth-form__button']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
        String text = driver.findElement(By.className("header__logout")).getText();
        System.out.println(text);
        WebElement element = driver.findElement(By.tagName("footer"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}