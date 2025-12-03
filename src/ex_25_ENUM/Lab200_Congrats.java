package ex_25_ENUM;

public class Lab200_Congrats {
    public static void main(String[] args){
        System.out.println(Env.STAGING.getBaseURL());
        System.out.println(Env.PROD.getBaseURL());
    }
}

