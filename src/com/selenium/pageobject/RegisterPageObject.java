package com.selenium.pageobject;

import com.selenium.action.BasePage;
import com.selenium.action.BaseTest;
import com.selenium.pageui.RegisterPageUI;

public class RegisterPageObject extends BaseTest {

    private BasePage basePage = new BasePage();

    public void clickToFirstName() {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_FIRST_NAME);
        basePage.click(driver, RegisterPageUI.XPATH_FIRST_NAME);
    }

    public void clickToLastName() {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_LAST_NAME);
        basePage.click(driver, RegisterPageUI.XPATH_LAST_NAME);
    }

    public void clickToEmail() {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_EMAIL);
        basePage.click(driver, RegisterPageUI.XPATH_EMAIL);
    }

    public void clickToPassword() {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_PASSWORD);
        basePage.click(driver, RegisterPageUI.XPATH_PASSWORD);
    }

    public void clickToRegisterSubmitButton() {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_BUTTON_REGISTER);
        basePage.click(driver, RegisterPageUI.XPATH_BUTTON_REGISTER);
    }

    public void clickToFemaleRadioButton() {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_FEMALE);
        basePage.click(driver, RegisterPageUI.XPATH_FEMALE);
    }

    public void sendKeysToFirstName(String keys) {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_FIRST_NAME);
        basePage.sendKeys(driver, RegisterPageUI.XPATH_FIRST_NAME, keys);
    }

    public void sendKeysToLastName(String keys) {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_LAST_NAME);
        basePage.sendKeys(driver, RegisterPageUI.XPATH_LAST_NAME, keys);
    }

    public void sendKeysToEmail(String keys) {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_EMAIL);
        basePage.sendKeys(driver, RegisterPageUI.XPATH_EMAIL, keys);
    }

    public void sendKeysToPassword(String keys) {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_PASSWORD);
        basePage.sendKeys(driver, RegisterPageUI.XPATH_PASSWORD, keys);
    }

    public void selectBirthDayDayDropdown(String value) {
        basePage.waitPresenceOfNestedElements(wait, RegisterPageUI.XPATH_BIRTHDAY_DAY, RegisterPageUI.DROPDOWN_TAG_NAME);
        basePage.selectDropdownByValue(driver, RegisterPageUI.XPATH_BIRTHDAY_DAY, value);
    }

    public void selectBirthDayMonthDropdown(String value) {
        basePage.waitPresenceOfNestedElements(wait, RegisterPageUI.XPATH_BIRTHDAY_MONTH, RegisterPageUI.DROPDOWN_TAG_NAME);
        basePage.selectDropdownByValue(driver, RegisterPageUI.XPATH_BIRTHDAY_MONTH, value);
    }

    public void selectBirthDayYearDropdown(String value) {
        basePage.waitPresenceOfNestedElements(wait, RegisterPageUI.XPATH_BIRTHDAY_YEAR, RegisterPageUI.DROPDOWN_TAG_NAME);
        basePage.selectDropdownByValue(driver, RegisterPageUI.XPATH_BIRTHDAY_YEAR, value);
    }

    public int getFirstNameErrorSize() {
        return basePage.getSize(driver, RegisterPageUI.XPATH_FIRST_NAME_ERROR);
    }

    public int getEmailErrorSize() {
        return basePage.getSize(driver, RegisterPageUI.XPATH_EMAIL_ERROR);
    }

    public int getPhoneFormatErrorSize() {
        return basePage.getSize(driver, RegisterPageUI.XPATH_PHONE_FORMAT_ERROR);
    }

    public void clickToCreateAccountButton() {
        basePage.waitElementToBeClickable(wait, RegisterPageUI.XPATH_CREATE_ACC_BUTTON);
        basePage.click(driver, RegisterPageUI.XPATH_CREATE_ACC_BUTTON);
    }

    public boolean checkFirstNameErrorDisplayed() {
        return basePage.isDisplayed(driver, RegisterPageUI.XPATH_FIRST_NAME_ERROR);
    }

    public boolean checkPhoneFormatErrorDisplayed() {
        return basePage.isDisplayed(driver, RegisterPageUI.XPATH_PHONE_FORMAT_ERROR);
    }

    public void waitFacebookTitle() {
        basePage.waitTitleIs(wait, RegisterPageUI.FB_TITLE);
    }

    public boolean checkEmailErrorDisplayed() {
        return basePage.isDisplayed(driver, RegisterPageUI.XPATH_EMAIL_ERROR);
    }

}
