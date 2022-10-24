package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By Home(){
        return By.className("oxd-userdropdown-name");
    }

    private By Admin(){
        return By.className("oxd-text oxd-text--h5 oxd-table-filter-title");
    }

    private By AdminButton(){
        return By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    }
    @Step
    public void validateOnHomePage(){
        $(Home()).isDisplayed();
    }

    @Step
    public void clickAdminButton(){
        $(AdminButton()).click();
    }
}
