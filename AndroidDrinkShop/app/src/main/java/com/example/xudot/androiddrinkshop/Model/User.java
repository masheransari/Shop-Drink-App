package com.example.xudot.androiddrinkshop.Model;

/**
 * Created by Xudot on 9/13/2018.
 */

public class User {

    private String phone;
    private String address;
    private String name;
    private String birthdate;
    private String error_msg;   //it will empty if user return null

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public String getPhone() {

        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getError_msg() {
        return error_msg;
    }

    public User() {

    }
}
