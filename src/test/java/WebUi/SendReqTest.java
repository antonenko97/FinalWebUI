package WebUi;

import WebUI.SendReqTestMain;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class SendReqTest extends AbstractClass {

    @Test
    @DisplayName("Отправка заявки")
    @Description("Проверка отправления заявки с формы callme на главной")
    @Severity(SeverityLevel.CRITICAL)
    public void SendIt() {
        super.init();
        new SendReqTestMain(getDriver()).clickCallMe();
        new SendReqTestMain(getDriver()).printName();
        new SendReqTestMain(getDriver()).printPhone();
        new SendReqTestMain(getDriver()).printMail();
        new SendReqTestMain(getDriver()).clickSubmit();
        Assertions.assertTrue(getDriver().getTitle().contains("Агентство элитной недвижимости в Москве"), "Wrong request!");
    }
}