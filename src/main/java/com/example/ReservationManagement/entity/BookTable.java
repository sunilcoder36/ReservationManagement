package com.example.ReservationManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reservation")
public class BookTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "customer")
    private String customer;
    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "time")
    private String tme;

    @Column(name = "date")
    private String dte;

    @Column(name = "isAvailable")
    private boolean isAvailable;

    @Column(name = "isStaffAvailable")
    private  boolean isStaffAvailable;



    public BookTable() {
        super();
    }

    public boolean isStaffAvailable() {
        return isStaffAvailable;
    }

    public void setStaffAvailable(boolean staffAvailable) {
        isStaffAvailable = staffAvailable;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public BookTable(int id, String customer, String email, String phone,
                     boolean  isAvailable,boolean isStaffAvailable, String tme, String dte) {
        super();
        this.id = id;
        this.customer = customer;
        this.email = email;
        this.phone = phone;
        this.tme = tme;
        this.dte = dte;
        this.isAvailable = isAvailable;
        this.isStaffAvailable=isStaffAvailable;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getTme() {
        return tme;
    }

    public void setTme(String tme) {
        this.tme = tme;
    }

    public String getDte() {
        return dte;
    }

    public void setDte(String dte) {
        this.dte = dte;
    }


}




