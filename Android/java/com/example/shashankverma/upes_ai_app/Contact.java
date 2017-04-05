package com.example.shashankverma.upes_ai_app;

/**
 * Created by SHASHANK VERMA on 05-04-2017.
 */

public class Contact {

    String id;
    String name;
    String email;
    String branch;
    String year;
    String mobileNumber;

    public  Contact()
    {}


    public Contact(String id, String email, String name, String branch, String year, String mobileNumber) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.mobileNumber = mobileNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBranch() {
        return branch;
    }

    public String getYear() {
        return year;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
