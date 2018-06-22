package pageObjects;

import actions.Methods;
import org.openqa.selenium.By;

public class Alert extends Methods {

    public static By alertButton() {
        return By.xpath("/html/body/button");
    }

    public static By inputAlertCard() {
        return By.xpath("/html/body/section/div/div[1]/div[1]/ul/li[2]/a");
    }

    public static By inputAlertText() {
        return By.xpath("//*[@id=\"demo\"]");
    }
}
