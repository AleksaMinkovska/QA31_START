import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class PhoneBookRegistration {

    WebDriver wd;


    @BeforeMethod
    public void openWeb() {
        wd.manage().window().maximize();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }


    @Test

    public void fillFOrmRegistration() {

        wd.findElement(By.tagName("input"));

        List<WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPassword = list.get(1);

        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("aleksa.minkovska@gmail.com");

        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Aminkov1234%");

        WebElement buttonRegistration = wd.findElement(By.tagName("button"));
//        List<WebElement> list1 = wd.findElements(By.tagName("button"));
//        WebElement buttonLogin = list1.get(0);
//        WebElement buttonRegistration = list.get(1);
//
//        buttonRegistration.click();
        buttonRegistration.click();


    }

    @AfterMethod

    public void close() {
        //wd.quit(); // close all tabs
        wd.close(); // focus wd
    }

}
