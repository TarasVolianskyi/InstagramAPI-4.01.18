package com.company;

public class Pojo {

    private String user;
    private String Prod;


    public Pojo(String user, String prod) {
        this.user = user;
        Prod = prod;
    }

    public String getProd() {
        return Prod;
    }

    public void setProd(String prod) {
        Prod = prod;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
