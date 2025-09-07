package com.DSPMU.RegistrationManager.Entities;

import jakarta.persistence.*;

@Entity
public class Attendees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Registration_id", unique = true)
    private Long user_id;
    @Column(name = "Name")
    private String user_Name;
    @Column(name = "City")
    private String user_City;
    @Column(name = "Email id", unique = true)
    private String user_Email;
    @Column(name = "Phone Number", length = 10, unique = true)
    private String user_Phone_no;
    @Column(name = "Registered on/at")
    private String Registered_on;


    Attendees(){
        //default constructor
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_City() {
        return user_City;
    }

    public void setUser_City(String user_City) {
        this.user_City = user_City;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getUser_Phone_no() {
        return user_Phone_no;
    }

    public void setUser_Phone_no(String user_Phone_no) {
        this.user_Phone_no = user_Phone_no;
    }

    public String getRegistered_on() {
        return Registered_on;
    }

    public void setRegistered_on(String registered_on) {
        Registered_on = registered_on;
    }

    public Attendees(Long user_id, String user_Name, String user_City, String user_Email, String user_Phone_no, String registered_on) {
        this.user_id = user_id;
        this.user_Name = user_Name;
        this.user_City = user_City;
        this.user_Email = user_Email;
        this.user_Phone_no = user_Phone_no;
        Registered_on = registered_on;
    }
}
