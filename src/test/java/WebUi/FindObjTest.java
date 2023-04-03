package WebUi;

import WebUI.FindObjMain;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebElement;

public class FindObjTest extends AbstractClass {

    @Test
    @DisplayName("Поиск объекта")
    @Description("Поиск объекта по названию через поисковую строку в фильтре")
    @Severity(SeverityLevel.CRITICAL)
    public void FindIt() {
        super.init();
        new FindObjMain(getDriver()).inputSearch();
        new FindObjMain(getDriver()).clickVar();
        Assertions.assertFalse(getDriver().getCurrentUrl().contains("Badaevskaya"), "Wrong request!");
    }
}
