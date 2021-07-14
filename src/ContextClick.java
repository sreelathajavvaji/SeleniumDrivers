import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class ContextClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        int intcnt  = driver.getWindowHandles().size();
        System.out.println(intcnt);
        String Mainwindow = driver.getWindowHandle();
        System.out.println(Mainwindow);

        Set<String> S1 = driver.getWindowHandles();
        for(String mulWindows : driver.getWindowHandles())
        {
            System.out.println(driver.switchTo().window(mulWindows));
        }

    }
}
