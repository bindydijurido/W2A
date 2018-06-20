package tests;

import actions.Methods;
import org.junit.Test;
import pageObjects.Registration;

public class RegistrationForm extends Methods {

    @Test
    public void fillRegisterForm() {

        driver.get("http://way2automation.com/way2auto_jquery/registration.php");

        let(Registration.firstName()).sendKeys("Jan");
        let(Registration.lastName()).sendKeys("Kowalski");
        Registration.maritalStatus("Single");
        Registration.hobby(true, true, true);
        Registration.country("India");
        Registration.dateOfBirth(1, 1, 2014);
        Registration.phoneNumber(513513513);
        let(Registration.userName()).sendKeys("jankowalski");
        let(Registration.eMail()).sendKeys("jan@kowalski.pl");
        Registration.yourProfilePicture("data/unnamed.txt");
        let(Registration.aboutYourself()).sendKeys("I love Pink Floyd");
        let(Registration.password()).sendKeys("start123");
        let(Registration.confirmPassword()).sendKeys("start123");

        let(Registration.submitButton()).click();
    }
}
