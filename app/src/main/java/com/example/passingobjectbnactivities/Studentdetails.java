package com.example.passingobjectbnactivities;

import java.io.Serializable;

public class Studentdetails implements Serializable {
    String Id,Name,Contact,Email;
    public Studentdetails(String id, String name, String contact, String email){
        Name=name;
        Id=id;
        Contact=contact;
        Email=email;
    }
}
