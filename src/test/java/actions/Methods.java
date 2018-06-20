package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Root;


public class Methods extends Root {

    public static WebElement let(By locator) {
        WebElement Element = driver.findElement(locator);
        return Element;
    }

    protected static void log(String element) {
        System.out.println(element);
    }
}
