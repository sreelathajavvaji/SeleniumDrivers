import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverClass {
    public static void main(String[] args) {
          System.setProperty("webdriver.Chrome.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("http://google.com");
          System.out.println("Application title:" + driver.getTitle());
    }
}
