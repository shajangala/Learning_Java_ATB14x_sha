package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
public static void main(String[] args)
{
    ICICIBank bank= new ICICIBank("Shamili",1000);
    long bal= bank.getBal();
    System.out.println(bal);

    //Cashier
    ICICIBank cashier= new ICICIBank("Sreesri",200);
    cashier.setBal(3000,false);
    System.out.println(cashier.getBal());
}
}

class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to set the balance of a customer account");
        }
    }
}