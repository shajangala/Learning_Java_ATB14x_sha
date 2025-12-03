package ex_27_Exceptions;

public class Lab221_CustomException {
    public static void main(String[] args) throws Exception {
       Bank sbi= new Bank("INR",100);
       Bank icici=new Bank("INR",2000);
       Integer total_balance= sbi.add(icici);
        System.out.println(total_balance);

        Bank jp_chase= new Bank("USD",101);
        Integer total_bal_all_countries= sbi.add(jp_chase);
        System.out.println(total_bal_all_countries);

    }
}

class Bank
{
    private String currency;
    private Integer amount;

    Bank(String c,Integer a)
    {
        this.currency=c;
        this.amount=a;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception {
        if (bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        }
            else {
            try {
                throw new CustomException("Currency mismatch, Can't proceed!");
            }
            catch (CustomException e)
            {
                throw new RuntimeException(e);
            }
        }


    }
}

class CustomException extends Exception{
  CustomException(String msg)
  {
      super(msg);
  }
}
