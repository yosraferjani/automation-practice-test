import AppPages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    static WebDriver driver;
    HomePage home;

@BeforeSuite
    public void setDriver()
{

   System.setProperty("Webdriver.gecko.driver",Util.GECKO_PATH);
    driver=new FirefoxDriver();
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    goHomePage();
}
@BeforeMethod
public void goHomePage()
{
    driver.get(Util.BASE_URL);
     home=new HomePage(driver);

}



@Test



@AfterSuite
    public void quitDriver()
{
    driver.quit();
}
}
