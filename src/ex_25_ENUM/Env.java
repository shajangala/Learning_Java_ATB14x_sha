package ex_25_ENUM;

public enum Env {

        DEV("https://dev.myapp.com"),
        STAGING("https://staging.myapp.com"),
        PROD("https://prod.myapp.com");

        private String baseURL;
        Env(String baseURL)
        {
            this.baseURL=baseURL;
        }
        public String getBaseURL(){
            return baseURL;
        }
    }


