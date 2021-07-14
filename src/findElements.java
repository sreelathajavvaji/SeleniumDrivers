import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/");
        List<WebElement> elementlist = driver.findElements(By.xpath("//*"));
        for(int lstcnt=0;lstcnt<elementlist.size();lstcnt++)
        {
            System.out.println(elementlist.get(lstcnt).getText());
        }
    }
}
