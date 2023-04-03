package WebUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindObjMain extends AbstractPage {

    @FindBy (xpath = "/html/body/div[2]/div[1]/div/div[3]/div[2]/form/div/div[1]/div[7]/div[1]/input")
    public WebElement search_input;

    @FindBy (xpath = "/html/body/div[2]/div[1]/div/div[3]/div[2]/form/div/div[1]/div[7]/div[2]/div/div[1]/div[2]/div[2]")
    public WebElement var_click;

    public FindObjMain(WebDriver driver) {
        super(driver);
    }

    public void inputSearch() {
        search_input.sendKeys("Barrin");
        new WebDriverWait(getDriver(), 2);
    }

    public void clickVar() {
        var_click.click();
        new WebDriverWait(getDriver(),10);
    }

}
