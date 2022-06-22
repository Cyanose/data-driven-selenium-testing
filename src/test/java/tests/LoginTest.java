package tests;

import data.TestDataSource;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends SeleniumBaseTest {

    @Test(dataProvider = "getDataFromDatabase",dataProviderClass = TestDataSource.class)
    public void shouldLog(String login, String password){
        System.out.println(login);
        System.out.println(password);
        new LoginPage(driver)
                .typeLogin(login)
                .typePassword(password)
                .submitLogin()
                .assertHeader();
    }
}
