package com.selenium.testcase;

import com.selenium.action.BaseTest;
import com.selenium.pageobject.RegisterPageObject;
import com.selenium.pageui.RegisterPageUI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPage extends BaseTest {
    private RegisterPageObject registerPO = new RegisterPageObject();

    @Test
    public void TC_01_RegisterWithEmptyData() {
        driver.get(RegisterPageUI.FB_LINK);
        registerPO.clickToCreateAccountButton();

//		registerPO.clickToFirstName();
//		registerPO.clickToLastName();
//		registerPO.clickToEmail();
//		registerPO.clickToPassword();
        registerPO.clickToRegisterSubmitButton();

        registerPO.clickToFirstName();

        if (registerPO.getFirstNameErrorSize() > 0) {
            Assert.assertTrue(registerPO.checkFirstNameErrorDisplayed());
        } else {
            System.out.println("Failed firstname input");
            Assert.fail();
        }

        registerPO.clickToEmail();

        if (registerPO.getEmailErrorSize() > 0) {
            Assert.assertTrue(registerPO.checkEmailErrorDisplayed());
        } else {
            System.out.println("Failed email input");
            Assert.fail();
        }
    }

    @Test
    public void TC_02_RegisterWithInvalidPhoneNumber() {
        driver.get(RegisterPageUI.FB_LINK);
        registerPO.clickToCreateAccountButton();

        registerPO.sendKeysToFirstName("Luong");
        registerPO.sendKeysToLastName("Minh");
        registerPO.sendKeysToEmail("03488888");
        registerPO.sendKeysToPassword("Test@12345");

        registerPO.selectBirthDayDayDropdown("12");
        registerPO.selectBirthDayMonthDropdown("2");
        registerPO.selectBirthDayYearDropdown("2000");
        registerPO.clickToFemaleRadioButton();

        registerPO.clickToRegisterSubmitButton();

        if (registerPO.getPhoneFormatErrorSize() > 0) {
            Assert.assertTrue(registerPO.checkPhoneFormatErrorDisplayed());
        } else {
            System.out.println("Failed phone number input");
            Assert.fail();
        }
    }

    @Test
    public void TC_03_LoginFormDisplayed() {
        driver.get(RegisterPageUI.FB_LINK);
        registerPO.clickToCreateAccountButton();

        registerPO.sendKeysToFirstName("Luong");
        registerPO.sendKeysToLastName("Minh");
        registerPO.sendKeysToEmail("0348886789");
        registerPO.sendKeysToPassword("Test@123456");

        registerPO.selectBirthDayDayDropdown("24");
        registerPO.selectBirthDayMonthDropdown("2");
        registerPO.selectBirthDayYearDropdown("2000");
        registerPO.clickToFemaleRadioButton();

        registerPO.clickToRegisterSubmitButton();

        registerPO.waitFacebookTitle();
        Assert.assertNotEquals(driver.getTitle(), "Facebook");
    }
}
