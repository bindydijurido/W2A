package pageObjects;

import org.openqa.selenium.By;
import actions.Methods;

public class RegistrationForm extends Methods {

    public By firstName() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[1]/p[1]/input");
    }

    public By lastName() {
        return By.xpath("/html/body/section/div/div/div/form/fieldset[1]/p[2]/input");
    }

    public void maritalStatus(String status) {

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

    public void hobby(boolean dance, boolean reading, boolean cricket) {

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

    public void country() {
        driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[4]/select/option[1]")).sendKeys("India");
    }

    public void dateOfBirth(int month, int day, int year) {

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

    public void phoneNumber(int pNumber) {
        driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[6]/input")).sendKeys(Integer.toString(pNumber));
    }

    public void userName(String userName) {
        driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[7]/input")).sendKeys(userName);
    }

    public void eMail(String eMail) {
        driver.findElement(By.xpath("/html/body/section/div/div/div/form/fieldset[8]/input")).sendKeys(eMail);
    }


}



