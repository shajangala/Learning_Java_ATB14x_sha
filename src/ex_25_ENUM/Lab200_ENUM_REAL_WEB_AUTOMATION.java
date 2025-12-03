package ex_25_ENUM;

public class Lab200_ENUM_REAL_WEB_AUTOMATION {
public static void main(String[] args)
{
    System.out.println(Locators.page_input_email.getLocator());
    System.out.println(Locators.page_input_password.getLocator());
    System.out.println(Locators.page_button.getLocator());
}
}

enum Locators
{
    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("//*[@id=\"js-login-btn\"]");

    private String locator;

    Locators(String locator){
      this.locator=locator;
    }

    public String getLocator() {
        return locator;
    }
}
