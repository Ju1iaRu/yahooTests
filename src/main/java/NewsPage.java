import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BasePage{
        public NewsPage(WebDriver driver) {
            super(driver);
        }
        // Вкладка "World"
        @FindBy(xpath = "//a[@title='World']")
        private WebElement tabWorld;
        // Вкладка "News Home"
        @FindBy(xpath = "//a[@title='News Home']")
        private WebElement tabNewsHome;
        // Посмотреть еще (вкладка троеточие)
        @FindBy(xpath = "//div[@data-subnav-type='more-menu']")
        private WebElement tabMoreMenu;
        // Вкладка "Videos"
        @FindBy(xpath = "//a[@title='Videos']")
        private WebElement tabVideos;
        // Ссылка Help
        @FindBy(xpath = "//a[@title='Help']")
        private WebElement helpSite;

        // Нажимаем на вкладку World
        public void clickTabWorld() {
            tabWorld.click();
        }
        // Нажимаем на вкладку News Home
        public void clickTabNewsHome() {
            tabNewsHome.click();
        }
        // Нажимаем на вкладку Videos
        public void clickTabVideos() {
            Actions builder = new Actions(driver);
            builder.moveToElement(tabMoreMenu).click(tabVideos);
            Action mouseoverAndClick = builder.build();
            mouseoverAndClick.perform();
        }
        // Скролим (иначе элемент не будет найден на странице)
        // и Нажимаем на ссылку Help
        public void clickHelpSite() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,30000)");
            Sleep(1000);
            js.executeScript("window.scrollBy(0,30000)");
            Sleep(1000);
            helpSite.click();
        }
}
