package WebUi;

import WebUI.SurfTestMain;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class SurfTest extends AbstractClass {

    @Test
    @DisplayName("Ссылки в хедере")
    @Description("Проверка кликабельности и совпадения тайтлов")
    @Severity(SeverityLevel.NORMAL)
    public void SurfIt() {
        super.init();
        new SurfTestMain(getDriver()).goToAbout();
        Assertions.assertTrue(getDriver().getTitle().contains("О компании."), "Wrong page!");
        new SurfTestMain(getDriver()).goToPublish();
        Assertions.assertTrue(getDriver().getTitle().contains("Аналитика по рынку недвижимости — Knight Frank"), "Wrong page!");
        new SurfTestMain(getDriver()).goToPartner();
        Assertions.assertTrue(getDriver().getTitle().contains("Зарабатывайте на недвижимости — партнерская программа Knight Frank"), "Wrong page!");
    }
}