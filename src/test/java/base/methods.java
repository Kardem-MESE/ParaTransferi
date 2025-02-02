package base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class methods extends connectElement {
    private static final Logger log = Logger.getLogger(String.valueOf(stepImplementation.class));
    public void clickkbot(String key) throws Exception {
        connection(key).click();
        log.info(key+ " Adresine Tiklandi");

    }

    public void clearbot(String key) throws Exception {
        try{
            connection(key).clear();
            log.info(key+ " texti silindi");

        }catch (Exception e){
            throw new Exception("Silerken hata oluştu");
        }

    }

    public void clearForKeyboardbot(String key) throws Exception {
        try{
            connection(key).sendKeys(Keys.CONTROL + "a");connection(key).sendKeys(Keys.BACK_SPACE);
            log.info(key+ " texti silindi");

        }catch (Exception e){
            throw new Exception("Silerken hata oluştu");
        }

    }

    public boolean visibility(String key) throws Exception {
        try{
            return connection(key).isDisplayed();

        }catch (Exception e){
            throw new Exception("Element gorunur degil");
        }

    }

    public boolean disablebot(String button) throws Exception {
        try{
            return !connection(button).isEnabled() || connection(button).getAttribute("disabled") != null;

        }catch (Exception e){
            throw new Exception("Silerken hata oluştu");
        }

    }

    public Boolean checkElementContainsText(String locatorName, String expectedText) throws Exception {
        Boolean value = connection(locatorName).getText().contains(expectedText);
        return value;
    }
    public void sendText(String text, String locatorName) throws Exception {
        System.out.println("metod1 calıstı");
        connection(locatorName).sendKeys(text);
        System.out.println("metod3 calıstı");
    }
}
