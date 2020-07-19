import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    public WebDriver driver;
    protected NewsPage newsPage;

    @BeforeMethod
    public void baseTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        newsPage = new NewsPage(driver);
        driver.get("https://news.yahoo.com");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Yahoo News - Latest News & Headlines"));
    }
     @AfterMethod
     public void quit() {
        driver.quit();
    }
}
