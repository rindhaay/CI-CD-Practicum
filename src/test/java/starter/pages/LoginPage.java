package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField(){
        return By.xpath("//input[@name='username']");
    }
    private By passwordField(){
        return By.xpath("//input[@name='password']");
    }
    private By loginButton(){
        return By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    }

    private By loginHeader() {
        return By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
    }
    @Step
    public void openPage(){
        open();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }
}
