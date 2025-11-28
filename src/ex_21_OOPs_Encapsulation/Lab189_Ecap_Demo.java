package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
public static void main(String[] args)
{
    VWOLogin login= new VWOLogin("Admin","pass123");
    System.out.println(login.password);
    login.password="3456";
    System.out.println(login.password);

    GoodVWOLogin login1= new GoodVWOLogin("admin", "pwd123");
    String pass= login1.getPassword();
    System.out.println(pass);
    login1.setPassword("newpwd123",true);
    System.out.println(login1.getPassword());
    login1.setPassword("nochangepwd123",false);
    System.out.println(login1.getPassword());

}
}

class VWOLogin
{
    public String username;
    public String password;

    public VWOLogin(String username,String password)
    {
        this.username = username;
        this.password = password;
    }
}

class GoodVWOLogin
{

    //Instance variable | Data variable | Attributes | Fields | Properties |
    private String username;
    private String password;

    public GoodVWOLogin(String username, String password)
    {
        this.username= username;
        this.password= password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public void setPassword(String password, boolean isGoodAuntyAdmin) {
        if (isGoodAuntyAdmin)
        {
            this.password=password;
        }
        else {
            System.out.println("You are not allowed to change the password");
        }

    }
    public String getPassword() {
        return password;
    }
}
