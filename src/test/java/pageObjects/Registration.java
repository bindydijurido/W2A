package pageObjects;

import org.openqa.selenium.By;
import actions.Methods;

import java.nio.file.Paths;

public class Registration extends Methods {

    public static By firstName() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[1]/p[1]/input");
    }

    public static By lastName() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[1]/p[2]/input");
    }

    public static void maritalStatus(String status) {

        if (status == "Single") {
            driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[2]/div/label[1]/input")).click();
        } else {
            log("You didn't pick Single marital status option");
        }

        if (status == "Married") {
            driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[2]/div/label[2]/input")).click();
        } else {
            log("You didn't pick Married marital status option");
        }

        if (status == "Divorced") {
            driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[2]/div/label[3]/input")).click();
        } else {
            log("You didn't pick Divorced marital status option");
        }
    }

    public static void hobby(boolean dance, boolean reading, boolean cricket) {

        if (dance == true) {
            driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[3]/div/label[1]/input")).click();
        } else {
            log("You didn't ticked Dance checkbox");
        }

        if (reading == true) {
            driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[3]/div/label[2]/input")).click();
        } else {
            log("you didn't ticked Reading checkbox");
        }

        if (cricket == true) {
            driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[3]/div/label[3]/input")).click();
        } else {
            log("You didn't ticked Cricket checkbox");
        }
    }

    public static void country(String country) {
        driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[4]/select/option[1]")).sendKeys(country);
    }

    public static void dateOfBirth(int month, int day, int year) {

        if (month == 1) {
            driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[5]/div[1]/select")).sendKeys(Integer.toString(month));
        }

        if (day == 1) {
            driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[5]/div[2]/select")).sendKeys(Integer.toString(day));
        }

        if (year == 2014) {
            driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[5]/div[3]/select")).sendKeys(Integer.toString(year));
        }
    }

    public static void phoneNumber(int pNumber) {
        driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[6]/input")).sendKeys(Integer.toString(pNumber));
    }

    public static By userName() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[7]/input");
    }

    public static By eMail() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[8]/input");
    }

    public static void yourProfilePicture(String path) {
        driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[9]/input")).sendKeys(Paths.get(path).toAbsolutePath().toString());
    }

    public static By aboutYourself() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[10]/textarea");
    }

    public static By password() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[11]/input");
    }

    public static By confirmPassword() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[12]/input");
    }

    public static By submitButton() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[13]/input");
    }

    public static By alertNoName() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[1]/p[1]/label[2]");
    }

    public static By alertNoHobby() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[3]/div/label[1]/label");
    }

    public static By alertNoPhoneNr() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[6]/label[2]");
    }

    public static By alertNoUserName() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[7]/label[2]");
    }

    public static By alertNoEmail() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[8]/label[2]");
    }

    public static By alertNoPassword() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[11]/label[2]");
    }

    public static By alertNoPsswdConfirmation() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[12]/label[2]");
    }
}