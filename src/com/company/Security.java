package com.company;

public class Security {

    private String password;

    public Security(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Security{" +
                "password='" + password + '\'' +
                '}';
    }
}
