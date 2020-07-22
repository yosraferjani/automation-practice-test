package AppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public WebElement checkEmailField() {
        return driver.findElement(By.id("email_create"));
    }

    public WebElement checkCreateButton() {
        return driver.findElement(By.id("SubmitCreate"));
    }

    public void createAccount(String email) {
        checkEmailField().sendKeys(email);
        checkCreateButton().submit();
    }

    public String getSubheading()
    {
       return driver.findElement(By.className("page-subheading")).getText();
    }
}
