import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        System.out.println("Application title:" + driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("sreelatha");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
