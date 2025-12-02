package ex_23_OOPs_Super_Abstraction.superKeyword;

public class Lab180 {

}

class BaseClass{

    BaseClass() {
        System.out.println("Default constructor of parent");
    }

    BaseClass(String browser) {
        this.browser = browser;
        System.out.println("Your present browser is "+browser);
    }

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
    void openBrowser()
    {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName)
    {
        System.out.println("Open Browser!"+browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser!");
    }
}
class TestCase extends BaseClass{
void testC(){}

    public TestCase() {
    // super();   DC
    super("Chrome"); // PC
    super.openBrowser();   // Normal F T1
    super.openBrowser("Mozila Firefox"); // Normal F T3
    super.closeBrowser();  //Normal F
        System.out.println(super.getBrowser()); //getter
        super.setBrowser("Edge"); //setter

    }
}