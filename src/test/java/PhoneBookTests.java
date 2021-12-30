import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PhoneBookTests {

    WebDriver wd;



    @BeforeMethod
    public void openSite(){
        wd = new ChromeDriver(); //without history
        wd.manage().window().maximize();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login"); //with history, back forward


    }

    @Test
    public void phoneBookStart(){

        WebElement element = wd.findElement(By.tagName("a"));
        element.click();
        element.clear();  // srabotajet tolko s elementami gde fiziceski mozno sdelatj clear.
        element.sendKeys("Hello");
        List<WebElement> list = wd.findElements(By.tagName("a"));

        /////////////////////////////////////////////////////////

        WebElement elId = wd.findElement(By.id("root"));
        WebElement elClass = wd.findElement(By.className("container"));
        WebElement elName = wd.findElement(By.name("EXAMPLE"));

        WebElement elLink = wd.findElement(By.linkText("HOME"));
        WebElement elPLink = wd.findElement(By.partialLinkText("HOM"));
    }

    @Test
    public void fillFormLogin(){
        wd.findElement(By.tagName("input"));  // vsegda najdjot tolko 1-ij element

        List <WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPassword = list.get(1);

        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("noa@gmail.com");

        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Nnoa12345$");

        WebElement buttonLogin = wd.findElement(By.tagName("button"));
        buttonLogin.click();
    }

    @AfterMethod
    public void close(){
        //wd.quit(); // close all tabs
        //wd.close(); // focus wd
    }
}
