package AppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage signIn() {
        driver.findElement(By.className("login")).click();
        return new LoginPage(driver);
    }

}
