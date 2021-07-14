import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextattribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        System.out.println("Application title:" + driver.getTitle());
//        System.out.println(driver.findElement(By.id("username")).getTagName());
//        driver.findElement(By.id("username")).
        if(driver.findElement(By.linkText("Context Menu")).isDisplayed()) {
            driver.findElement(By.linkText("Context Menu")).click();
        }
        else
        {
            System.out.println("WebElement not found");
        }
    }
}
