package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    protected WebDriver driver;

    @FindBy(css = "input[type='text']")
    private WebElement inputUserId;

    @FindBy(css = "input[type='password']")
    private WebElement inputPassword;

    @FindBy(css = "input[type='submit']")
    private WebElement loginBtn;

    @FindBy(css = "input[type='reset']")
    private WebElement resetBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage typeLogin(String login){
        inputUserId.sendKeys(login);
        return this;
    }
    public LoginPage typePassword(String password){
        inputPassword.sendKeys(password);
        return this;
    }
    public HomePage submitLogin(){
        loginBtn.click();
        return new HomePage(driver);
    }
    public LoginPage submitLoginWithFailure(){
        loginBtn.click();
        return this;
    }
}
