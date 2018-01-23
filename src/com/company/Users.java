package com.company;

public class Users {

    private String name;
    private String lastName;
    private String email;
    private int Phone;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", Phone=" + Phone +
                '}';
    }

    public Users(String name, String lastName, String email, int phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        Phone = phone;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
