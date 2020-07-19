import org.testng.Assert;
import org.testng.annotations.Test;

public class WorldTest extends BaseTest {
    @Test
    public void WorldTest() {
    newsPage.clickTabWorld();
    Assert.assertTrue(driver.getTitle().contains("World | Yahoo News"),  "Страница World не открылась или изменился title страницы");
    newsPage.clickTabNewsHome();
    }
}
