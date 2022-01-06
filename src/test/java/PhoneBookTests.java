import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PhoneBookTests{

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
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a")); // xPath
        element.click();
        element.clear();  // srabotajet tolko s elementami gde fiziceski mozno sdelatj clear.
        element.sendKeys("Hello");
        List<WebElement> list = wd.findElements(By.tagName("a"));

        /////////////////////////////////////////////////////////

        WebElement elId = wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root")); //  # - rewetka znachit id
        wd.findElement(By.xpath("//*[@id='root']")); // xPath

        WebElement elClass = wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container"));  // . - tocka oboznacjajet klass
        wd.findElement(By.xpath("//*[@class='container'")); // -xPath

        WebElement elName = wd.findElement(By.name("EXAMPLE"));
        wd.findElement(By.cssSelector("[name='nameEx'")); // cssSelector
        wd.findElement(By.xpath("//*[@name='nameEx'")); // xPath

        WebElement elLink = wd.findElement(By.linkText("HOME"));
        WebElement elPLink = wd.findElement(By.partialLinkText("HOM"));

        wd.findElement(By.cssSelector("[href='/home']"));   // by href
        wd.findElement(By.xpath("//*[@href='/home'")); // * - ne znaja elementi

        wd.findElement(By.cssSelector("a[href='/home']"));
        wd.findElement(By.xpath("//a[@href='/home'")); // - znaja element 'a'


    }

    @Test
    public void fillFormLogin(){
        wd.findElement(By.tagName("input"));  // vsegda najdjot tolko 1-ij element

        List <WebElement> list = wd.findElements(By.tagName("iut"));
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

    @Test
    public void fillFormRegistration() {

        List<WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPassword = list.get(1);

        // WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder='Email']"));   // 2-oj variat rewenija, prowe i bolee pravilno

        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("markus.zilakov@yahoo.com");

        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Mastr9876$");

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement buttonRegistration = buttons.get(1);

        buttonRegistration.click();

    }



    @AfterMethod
    public void close(){
        //wd.quit(); // close all tabs
        //wd.close(); // focus wd
    }



}
