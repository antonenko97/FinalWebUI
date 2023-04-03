package WebUi;

import WebUI.ObjPrevMain;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.*;

public class ObjPrevTest extends AbstractClass {

    @Test
    @DisplayName("Скролл фото на превью")
    @Description("Проверка кликабельности стрелочек на карточке превью")
    @Severity(SeverityLevel.NORMAL)
    public void ScrollIt() {
        super.init();
        new ObjPrevMain(getDriver()).clickShow();
        Assertions.assertTrue(getDriver().getCurrentUrl().contains("gorod"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        new ObjPrevMain(getDriver()).click2Show();
        Assertions.assertTrue(getDriver().getCurrentUrl().contains("gorod/discount"));
        new ObjPrevMain(getDriver()).rightScroll();
        Assertions.assertNotNull(getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/a/div/div[4]")));
        new ObjPrevMain(getDriver()).leftScroll();
        Assertions.assertNotNull(getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/a/div/div[3]")));
    }
}