package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage extends BasePageClass {


    private String url = "https://stage.4frag.ru/";

    private By buyProductLocator = By.xpath("//a[text()='Купить']");

    private By closeButtonWindowLocator = By.xpath("//div[@id='notification-type']//button[contains(@class,'close')]");

    private By cardButtonLocator = By.xpath("//span[text() = 'Корзина']");

    private By loginPageLocator = By.xpath("//a[text() = 'Вход/регистрация']");


    public MainPage openHomePage() {
        open(url);
        return this;
    }



    public MainPage addProductToCard() {
        WebElement buyButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(buyProductLocator));
        buyButton.click();
        return this;
    }

    public MainPage closePopUpWindow() {

        WebElement closeButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(closeButtonWindowLocator));
        closeButton.click();

        return this;
    }



    public CardPage goToTheCardPage() {
        maximizeWindow();
        WebElement closeButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(cardButtonLocator));
        closeButton.click();
        return new CardPage();
    }


    public LoginPage openLoginPage(){

        WebElement loginPage = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(loginPageLocator));
        loginPage.click();
        maximizeWindow();
      return new LoginPage();
    }
}

