package Ya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {
    public void inputLogin(WebDriver driver){

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mironov1993@bk.ru");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("524861");
        driver.findElement(By.xpath(".//button[@class='auth-form__button']")).click();
    }



}
