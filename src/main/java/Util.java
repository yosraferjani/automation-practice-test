import AppPages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Util {
    public static final String BASE_URL="http://automationpractice.com";
    public static final String GECKO_PATH="C:\\Users\\yosra\\Desktop\\Testing\\seelenium\\geckoDriver\\geckodriver-v0.26.0-win64\\geckodriver.exe";
    public static WebDriver driver;
    public static final String LOGIN_PAGE_TITLE="Login - My Store";
    public static final String VALID_EMAIL="tester-user@gmail.com";
    public static final String INVALID_EMAIL="tester-user@.com";
    public static final String PAGE_SUBHEADING="Your personal information";
    public HomePage home;


@Before
    public void setDriver() {
        System.setProperty("webdriver.gecko.driver", Util.GECKO_PATH);
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }



}
