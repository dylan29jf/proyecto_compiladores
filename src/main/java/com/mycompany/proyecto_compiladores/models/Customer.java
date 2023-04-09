/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_compiladores.models;

import java.util.Date;

/**
 *
 * @author dylan
 */
public class Customer {
    
    private String name;
    private String lastname;
    private String email;
    private String birthday;
    private String typeOfMembership;
    private String validity;
    
    private String fullName;
    private String address;
    private String booth;
    private String monthlySalary;
    private Date date;
    

    public Customer() {
    }

    public Customer(String name, String lastname, String email, String birthday, String typeOfMembership, String validity) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.birthday = birthday;
        this.typeOfMembership = typeOfMembership;
        this.validity = validity;
    }
    
    public Customer(String fullName, Date date, String correo, String address, String booth, String montylySalary){
        this.fullName = fullName;
        this.date = date;
        this.address = address;
        this.email = correo;
        this.booth = booth;
        this.monthlySalary = montylySalary;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTypeOfMembership() {
        return typeOfMembership;
    }

    public void setTypeOfMembership(String typeOfMembership) {
        this.typeOfMembership = typeOfMembership;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBooth() {
        return booth;
    }

    public void setBooth(String booth) {
        this.booth = booth;
    }

    public String getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(String monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
