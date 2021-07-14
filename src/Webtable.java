import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        System.out.println("Application title:" + driver.getTitle());
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        System.out.println(driver.findElement((By.xpath("//table[2]/tbody/tr[3]/td[2]"))).getText());
//        driver.findElement((By.xpath("//table[2]/tbody/tr[3]/td[2]"))).


    }
}
