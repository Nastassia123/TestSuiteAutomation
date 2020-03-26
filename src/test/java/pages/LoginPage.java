package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageClass {

    private By emailFieldLocator = By.xpath("//input[@id = 'exampleInputEmail1']");

    private By passwordFieldLocator = By.xpath("//input[@id = 'exampleInputPassword1']");

    private By signInButtonLocator = By.xpath("//button[text() = 'Войти']");

    private String emailValue = "nastya.chelyapina@gmail.com";

    private String passwordValue = "7845366Nastya";


    public LoginPage fillOutEmailField() {
        WebElement emailField = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(emailFieldLocator));
        emailField.sendKeys(emailValue, Keys.ENTER);
        return this;
    }


    public PersonalAreaPage fillOutPasswordField()  {
        WebElement passwordField = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(passwordFieldLocator));
        passwordField.sendKeys(passwordValue, Keys.ENTER);
        return new PersonalAreaPage();
    }

   /* public PersonalAreaPage signIntoApplication() {
        WebElement signInButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(signInButtonLocator));
        signInButton.click();
        return new PersonalAreaPage();
    }

    */
}
