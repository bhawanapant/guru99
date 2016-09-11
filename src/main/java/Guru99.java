import org.openqa.selenium.WebDriver;

public class Guru99 {
    private String username ;
    private String password;
    private Guru99Login gurulogin;
    private Guru99HomePage guruhomepage;
    private Guru99AddNewCustomer guruaddnewcustomer;
    private Guru99VerifyCustomerDetails guruverifydetails;
    private String customerName;
    private Character gender;
    private String dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String mobileNumber;
    private String eMail;
    private String newpassword;

    public Guru99(WebDriver driver, String username, String password) {
        this.gurulogin = new Guru99Login(driver);
        this.guruhomepage = new Guru99HomePage(driver);
        this.guruaddnewcustomer = new Guru99AddNewCustomer(driver);
        this.guruverifydetails = new Guru99VerifyCustomerDetails(driver);
        this.username = username;
        this.password = password;
    }

    public void verifyHomePageDisplayCorrect() {
        String title = gurulogin.getTitleText();
        System.out.println("Title of the page :   " + title);
    }

    public void login() {
        gurulogin.login(this.username, this.password);
    }

    public void getLoggedInUserNameFromHomePage() {
        guruhomepage.getManagerIDHomepageUser();
    }

    public void clickOnNewCustomerLink() { guruaddnewcustomer.clickOnNewCustomerLink();}

    public void addNewCustomerDetail(String customerName , Character gender , String dob ,String address , String city , String
                                     state , String pin, String mobileNumber, String eMail, String newPassword)
    {
        this.customerName = customerName;
        this.gender = gender;
        this.dateOfBirth = dob;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.mobileNumber = mobileNumber;
        this.eMail =  eMail;
        this.newpassword = newPassword;

        guruaddnewcustomer.submitNewCustomerDetails(this.customerName , this.gender,this.dateOfBirth,this.address,this.city
                ,this.state,this.pin,this.mobileNumber,this.eMail, this.newpassword);
    }
    public void verifyNewCustomerDetails()
    {
        guruverifydetails.verifySuccessMessage();
        System.out.println("Customer ID is :  "+ guruverifydetails.getCustomerID());
        System.out.printf("Customer Details as :  " + guruverifydetails.getCustomerDetails());
    }
}
