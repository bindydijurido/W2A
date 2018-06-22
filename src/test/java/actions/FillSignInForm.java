package actions;

import org.openqa.selenium.By;

public class FillSignInForm extends Methods {


    public static void singIntoAccount() {

        let(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div/div[1]/p/a")).click(); //login button
        let(By.xpath("/html/body/div[2]/div/div/div/div/div/form/fieldset[1]/input")).sendKeys("lubiepinkfloyd"); // username form
        let(By.xpath("/html/body/div[2]/div/div/div/div/div/form/fieldset[2]/input")).sendKeys("start123"); // userpasswd form

        let(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div/div[2]/input")).click(); //login bttn
    }

}
