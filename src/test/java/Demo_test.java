import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class Demo_test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://orderific.com/qrcode-bug");
        driver.findElement(By.id("malink")).click();
        driver.findElement(By.id("malink")).sendKeys("Google.com");
        Thread.sleep(500);
        driver.quit();


    }
}
