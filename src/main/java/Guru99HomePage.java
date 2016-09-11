import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99HomePage {
   private WebDriver driver;
    private By strManagerID;

    public Guru99HomePage(WebDriver driver) {
        this.driver = driver;
        strManagerID = By.xpath("//table//tr[@class='heading3']");
    }

    public String getManagerIDHomepageUser(){
        final String managerId = driver.findElement(strManagerID).getText();
        System.out.printf("The manager id is (%s)", managerId);
        return managerId;
    }
}
