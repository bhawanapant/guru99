import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;


public class Guru99VerifyCustomerDetails {

    private WebDriver driver;
    private By strSuccessMessage;
    private By intCustomerID;
    private By strCustomerName;
    private By strCustomerGender;
    private By strDateOfBirth;
    private By strAddress;
    private By strCity;
    private By strState;
    private By strPin;
    private By intMobileNo;
    private By strEmail;

    public Guru99VerifyCustomerDetails(WebDriver driver) {
        this.driver = driver;
        strSuccessMessage = By.xpath("//table[@id = 'customer']//p[@class = 'heading3']");
        intCustomerID = By.xpath("//table[@id = 'customer']/tbody/tr[4]/td[2]");
        strCustomerName = By.xpath("//table[@id = 'customer']/tbody/tr[5]/td[2]");
        strCustomerGender = By.xpath("//table[@id = 'customer']/tbody/tr[6]/td[2]");
        strDateOfBirth = By.xpath("//table[@id = 'customer']/tbody/tr[7]/td[2]");
        strAddress = By.xpath("//table[@id = 'customer']/tbody/tr[8]/td[2]");
        strCity = By.xpath("//table[@id = 'customer']/tbody/tr[9]/td[2]");
        strState = By.xpath("//table[@id = 'customer']/tbody/tr[10]/td[2]");
        strPin = By.xpath("//table[@id = 'customer']/tbody/tr[11]/td[2]");
        intMobileNo = By.xpath("//table[@id = 'customer']/tbody/tr[12]/td[2]");
        strEmail = By.xpath("//table[@id = 'customer']/tbody/tr[13]/td[2]");
    }

    public void verifySuccessMessage (){
        Assert.assertTrue("Customer Registered Successfully!!!" ,driver.findElement(strSuccessMessage).isDisplayed());
    }

    public String getCustomerID(){
        return driver.findElement(intCustomerID).getText();
    }
    public String getCustomerDetails() {
        String strCustomerDetail = driver.findElement(strCustomerName).getText() + "  " + driver.findElement(strCustomerGender).getText()
                + "  " + driver.findElement(strDateOfBirth).getText() + "  " + driver.findElement(strAddress).getText() + "  "
                + driver.findElement(strCity).getText() + "  " + driver.findElement(strState).getText() + "  " +
                driver.findElement(strPin).getText() + "  " + driver.findElement(intMobileNo).getText() + " "  +
                driver.findElement(strEmail).getText();
        return strCustomerDetail;
    }

}
