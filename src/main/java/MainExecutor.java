import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainExecutor {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Guru99 guru99 = new Guru99(driver, "mngr48267", "zAbUrEj");
        guru99.verifyHomePageDisplayCorrect();
        guru99.login();
        guru99.getLoggedInUserNameFromHomePage();
        guru99.clickOnNewCustomerLink();
        guru99.addNewCustomerDetail("Bhawana",'f',"03/09/1985","5 oast court","Staines","Middlesex","263153","07887659987"
                , "soni.pant2@gmail.com","abcd123");
        guru99.verifyNewCustomerDetails();

    }
}



