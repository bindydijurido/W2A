package tests;

import actions.Methods;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.Alert;

public class AlertFunctionality extends Methods {

    @Test
    public void simpleAlertFunctionality() {

        driver.get("http://way2automation.com/way2auto_jquery/alert.php");
        let(Alert.alertButton()).click();

        Assert.assertEquals("I am an alert box!", driver.switchTo().alert().getText());
    }

    @Test
    public void inputAlertFunctionality() {

        driver.get("http://way2automation.com/way2auto_jquery/alert.php");
        let(Alert.inputAlertCard()).click();
        let(Alert.alertButton()).click();
        driver.switchTo().alert().sendKeys("I love Pink Floyd");

        Assert.assertEquals("Hello I love Pink Floyd! How are you today?", let(Alert.inputAlertText()).getText());
    }
}
