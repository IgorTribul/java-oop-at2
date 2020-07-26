package ru.geekbrains.java.oop.at2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage{

    @FindBy(css = "[placeholder=\"E-mail\"]")
    private WebElement inputLogin;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[class=\"btn btn-block btn-success\"]")
    private WebElement buttonSignIn;

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ContentPage signIn(String login, String password){
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);

        buttonSignIn.click();

        return new ContentPage (driver);
    }
    public WebElement getInputLogin() {
        return inputLogin;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getButtonSignIn() {
        return buttonSignIn;
    }
}



