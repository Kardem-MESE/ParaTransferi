package base;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class stepImplementation extends baseTest {
    methods komut = new methods();
    private Logger logger = LoggerFactory.getLogger(getClass());
    HashMap<String, String> keyMap = new HashMap<String, String>();


    @Step("Wait <second> Seconds")
    public void wait(int second) throws InterruptedException {
        Thread.sleep(1000 * second);
        logger.info("Waited " + second + " Seconds. ");
    }

    @Step("Go To <url> Address")
    public void goToUrl(String url) {
        driver.get(url);
        logger.info("Navigated to " + url + " Address");
    }

    @Step("Click The <locatorName> Element")
    public void clickElement(String locatorName) throws Exception {

        komut.clickkbot(locatorName);
    }

    @Step("Clear The <locatorName> Element")
    public void clearElement(String locatorName) throws Exception {

        komut.clearbot(locatorName);
    }

    @Step("Clear for keyboard <locatorName> Element")
    public void clearforKeyboardElement(String locatorName) throws Exception {

        komut.clearForKeyboardbot(locatorName);
    }

    @Step("Disable The <locatorName> Button")
    public void isButtonDisabled(String button) throws Exception {
        Assertions.assertTrue(komut.disablebot(button), "Buton disable degil");
    }

    @Step("Visibility The <locatorName> Element")
    public void visibilityElement(String locatorName) throws Exception {
        Assertions.assertTrue(komut.visibility(locatorName));
    }

    @Step("Check If Element <locatorName> Contains Text <expectedText>")
    public void checkElementContainsText(String locatorName, String expectedText) throws Exception {
        Boolean containsText = komut.checkElementContainsText(locatorName,expectedText);
        Assertions.assertTrue(containsText, "Expected text is not contained");
        logger.info(locatorName + " Element Contains The " + expectedText + " Value");
    }

    @Step("Send <text> Value To Element <locatorName>")
    public void sendKeys(String text, String locatorName) throws Exception {
        //findElement(locatorName).sendKeys(text);
        System.out.println("stepIml calıstı");
        komut.sendText(locatorName, text);
        logger.info(text + " Value Writed To The " + locatorName + " Element.");
    }

}
