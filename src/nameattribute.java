import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameattribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        System.out.println("Application title:" + driver.getTitle());
        driver.findElement(By.name("email")).sendKeys("sreelatha");
//        driver.findElement(By.name("pass")).sendKeys("password");
//        driver.findElement(By.name("email")).
//        driver.findElement(By.name("pass")).sendKeys("password");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
