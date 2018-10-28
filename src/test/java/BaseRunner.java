import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseRunner {
    public String browserName;
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() {
        driver = getDriver();
        baseUrl = "https://moscow-job.tinkoff.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @After
    public void tearDown() {
        driver.quit();
    }

    private WebDriver getDriver() {
        browserName = System.getProperty("browser");
        if (browserName == null) {
            browserName = "chrome";
        }
        System.setProperty("browser", browserName);
        return BrowsersFactory.valueOf(browserName).create();
    }

}