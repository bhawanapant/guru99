import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
    private WebDriver driver;
    private By userName;
    private By userPassword;
    private By titleText;
    private By userLogin;

    public Guru99Login(WebDriver driver) {
        this.driver = driver;
        this.driver.get("http://demo.guru99.com/V4/");
        this.userName = By.name("uid");
        this.userPassword = By.name("password");
        this.titleText = By.className("barone");
        this.userLogin = By.name("btnLogin");
    }

    private void setUsername (String strUsername){
        driver.findElement(userName).sendKeys(strUsername);
    }

    private void setPassword(String strPassword){
        driver.findElement(userPassword).sendKeys(strPassword);
    }

    private void clickLogin(){
        driver.findElement(userLogin).click();
    }

    public String getTitleText() {
       return driver.findElement(titleText).getText();
    }

    public void login(String strUsername, String strPassword){
        this.setUsername(strUsername);
        this.setPassword(strPassword);
        this.clickLogin();
    }
}
