import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\sjavvaji5\\DXCProjects\\DXC Data\\SeleniumTrainingBatch2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        driver.manage().window().maximize();
        Select Listitem = new Select(driver.findElement(By.xpath("//select[@id='Carlist']")));
//        Listitem.selectByValue("BMW Car");
        Listitem.selectByIndex(1);
    }
}
