import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CSS_Practic_HW {

    WebDriver wd;

    @BeforeMethod

    public  void preCondition(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }



    @Test

    public void findMethods(){

        // find table
        wd.findElement(By.cssSelector("table"));

        // tr9 - one element
        wd.findElement(By.cssSelector("table tbody tr:nth-child(9)"));

        //Maria Anders - one element
        wd.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2)"));

        // last column  -all elements
        wd.findElements(By.cssSelector("td:nth-child(3)"));

        // th elements
        wd.findElements(By.cssSelector("th"));

        //Centro comercial Moctezuma	Francisco Chang	Mexico -  one element
        wd.findElement(By.cssSelector("tbody tr:nth-child(4)"));

        //	Giovanni Rovelli  = one element
        wd.findElement(By.cssSelector("tr:nth-child(9) td:nth-child(2)"));

        // first column - all elements
        wd.findElements(By.cssSelector("td:nth-child(1)"));

    }


}
