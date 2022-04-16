package gb.locators;

import gb.locators.Android.AndroidFormsPageLocators;
import gb.locators.Android.AndroidLoginPageLocators;
import gb.locators.Android.AndroidMainPageLocators;
import gb.locators.Android.AndroidSwipePageLocators;
import gb.locators.iOS.iOSFormsPageLocators;
import gb.locators.iOS.iOSLoginPageLocators;
import gb.locators.iOS.iOSMainPageLocators;
import gb.locators.iOS.iOSSwipePageLocators;
import gb.locators.interfaces.FormsPageLocators;
import gb.locators.interfaces.LoginPageLocators;
import gb.locators.interfaces.MainPageLocators;
import gb.locators.interfaces.SwipePageLocators;

public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();
    public static final FormsPageLocators FORMS_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidFormsPageLocators() : new iOSFormsPageLocators();
    public static final SwipePageLocators SWIPE_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidSwipePageLocators() : new iOSSwipePageLocators();

}
