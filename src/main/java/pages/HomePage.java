package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    /*
    @FindBy(css = "marquee.heading3")
    private WebElement annoyingFloatingHeader;
     */
    protected WebDriver driver;

    @FindBy(css ="a[href*='Manager']")
    private WebElement managerBtn;

    @FindBy(css ="a[href*='addcustomer']")
    private WebElement newCustomerBtn;

    @FindBy(css ="a[href*='Edit']")
    private WebElement editCustomerBtn;

    @FindBy(css ="a[href*='Delete']")
    private WebElement deleteCustomerBtn;

    @FindBy(css = "addAcount")
    private WebElement newAccountBtn;

    @FindBy(css = "editAccount")
    private WebElement editAccountBtn;

    @FindBy(css = "deleteAccount")
    private WebElement delteAccountBtn;

    @FindBy(css = "Deposit")
    private WebElement depositBtn;

    @FindBy(css = "Withdrawal")
    private WebElement withdrawalBtn;

    @FindBy(css = "Fund")
    private WebElement fundTransferBtn;

    @FindBy(css = "Password")
    private WebElement changePasswordBtn;

    @FindBy(css = "BalEnq")
    private WebElement balanceEnquiryBtn;

    @FindBy(css = "Customised")
    private WebElement customisedStatementBtn;

    @FindBy(css = "Logout")
    private WebElement logoutBtn;

    @FindBy(css = ".barone")
    private WebElement header;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public HomePage assertHeader(){
        Assert.assertEquals(header.getText(),"Guru99 Bank");
        return this;
    }


}
