package ex_25_ENUM;

public class Lab199_ENUM_P3 {
public static void main(String[] args){
    System.out.println(HEX_COLOR.valueOf("Red"));
    System.out.println(HEX_COLOR.Blue.getHexCode());
}
}

enum HEX_COLOR
{
    Red("#FF0000"),
    Blue("#0000FF"),
    Green("#008000"),
    Yellow("#FFFF00");

    private String hexCode;
    HEX_COLOR(String hexCode)
    {
             this.hexCode=hexCode;
    }

    String getHexCode(){
        return this.hexCode;
    }


}