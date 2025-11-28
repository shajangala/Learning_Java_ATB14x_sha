package ex_20_OOPs_Polymorphism.methodoveloading;

public class Lab190_MethodOverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1= new ChromeTC();
        c1.openBrowser();

        FirefoxTC f1= new FirefoxTC();
        f1.openBrowser();

        CommonToAll cta1= new CommonToAll();
        cta1.openBrowser();

        CommonToAll cta2= new ChromeTC(); //Dynamic dispatch
        cta2.openBrowser();

        CommonToAll cta3= new FirefoxTC(); //Dynamic dispatch
        cta3.openBrowser();

    }

}

class CommonToAll {
    void openBrowser() {
        System.out.println("Starting with IE browser");
    }
}

    class ChromeTC extends CommonToAll{

    @Override
        void openBrowser(){
        System.out.println("Starting Chrome, Better Browser!!");
    }
}


class FirefoxTC extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("Starting Firefox, Better Browser!!");
    }
}