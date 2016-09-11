import com.sun.jna.platform.win32.WinDef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Guru99AddNewCustomer {

    private WebDriver driver;
    private By newCustomerLink;
    private By customerName;
    private By gender;
    private By dateOfBirth;
    private By address;
    private By city;
    private By state;
    private By pin;
    private By mobileNumber;
    private By eMail;
    private By password;
    private By submit;

    public Guru99AddNewCustomer(WebDriver driver)

    {
        this.driver = driver;
        newCustomerLink = By.linkText("New Customer");
        customerName = By.name("name");
        dateOfBirth = By.id("dob");
        address = By.name("addr");
        city = By.name("city");
        state = By.name("state");
        pin = By.name("pinno");
        mobileNumber = By.name("telephoneno");
        eMail = By.name("emailid");
        password = By.name("password");
        submit = By.name("sub");

    }

    public void clickOnNewCustomerLink(){driver.findElement(newCustomerLink).click();}
    public void setCustomerName (String strCustomerName){ driver.findElement(customerName).sendKeys(strCustomerName);}
    public void setGender (Character strGender)
    {
        gender = By.xpath("//input[@value=" +"'" + strGender + "'"+"]");
        driver.findElement(gender).click();}
    public void setDateOfBirth (String strDOB){  driver.findElement(dateOfBirth).sendKeys(strDOB);}
    public void setAddress (String strAddress){ driver.findElement(address).sendKeys(strAddress);}
    public void setCity (String strCity){ driver.findElement(city).sendKeys(strCity);}
    public void setState (String strState){ driver.findElement(state).sendKeys(strState);}
    public void setPIN (String strPIN){ driver.findElement(pin).sendKeys(strPIN);}
    public void setMobileNumber (String strMobileNumber){ driver.findElement(mobileNumber).sendKeys(strMobileNumber);}
    public void setEmail (String strEmail){ driver.findElement(eMail).sendKeys(strEmail);}
    public void setPassword (String strPassword){ driver.findElement(password).sendKeys(strPassword);}
    public void clickOnSubmit(){driver.findElement(submit).click();}

    public void submitNewCustomerDetails(String strCustomerName , Character strGender , String strDOB, String strAddress , String strCity, String strState,
                                         String strPIN , String strMobileNumber ,String strEmail , String strPassword ){
        this.clickOnNewCustomerLink();
        this.setCustomerName(strCustomerName);
        this.setGender(strGender);
        this.setDateOfBirth(strDOB);
        this.setAddress(strAddress);
        this.setCity(strCity);
        this.setState(strState);
        this.setPIN(strPIN);
        this.setMobileNumber(strMobileNumber);
        this.setEmail(strEmail);
        this.setPassword(strPassword);
        this.clickOnSubmit();
    }
}
