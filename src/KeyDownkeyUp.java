import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownkeyUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        Actions actiondriver = new Actions(driver);
        actiondriver.keyDown(Keys.SHIFT).sendKeys(driver.findElement(By.xpath("//input[@id='username']")),"sreelatha").build().perform();
        actiondriver.keyUp(Keys.SHIFT).build().perform();
        actiondriver.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//        actiondriver.keyUp(Keys.CONTROL).build().perform();
        actiondriver.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//        actiondriver.keyUp(Keys.CONTROL).build().perform();
        actiondriver.sendKeys(Keys.TAB).build().perform();
        actiondriver.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        actiondriver.keyUp(Keys.CONTROL).build().perform();







    }
}
