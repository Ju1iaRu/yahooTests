import org.testng.Assert;
import org.testng.annotations.Test;

public class VideosTest extends BaseTest {
    @Test
    public void VideosTest() {
        newsPage.clickTabVideos();
        newsPage.clickHelpSite();
        Assert.assertTrue(driver.getTitle().contains("Help for your Yahoo"),  "Страница Help не открылась или изменился title страницы");
    }
}
