package ex_30_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab250_REAL_EXAMPLE {
    public static void main(String[] args)
    {

        //Storing environment - specific configurations
        Map<String,String> Env= new HashMap();
        Env.put("Production", "https://prod.api.com");
        Env.put("Staging", "https://staging.api.com");

        //Managing user credentials

        Map<String, String> Credentials= new HashMap();
        Credentials.put("admin","admin123");
        Credentials.put("user","user123");
        Credentials.put("user2",null);
        Credentials.put("user3",null);

        //Sending the data  from Map to Json, Json to Map -- API Automation
        //web selenium -- Store the Web elements with Keys.

    }
}
