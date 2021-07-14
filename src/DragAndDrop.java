import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver", "C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();
      //  Thread.sleep(3000);

        Actions actiondriver = new Actions(driver);
        actiondriver.dragAndDropBy(driver.findElement(By.xpath("//input[@value='0']")), 0, 100).build().perform();
//        actiondriver.doubleClick()
        actiondriver.release();
    }
}
