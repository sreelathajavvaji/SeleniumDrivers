import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://flipkart.com");
    }
}
