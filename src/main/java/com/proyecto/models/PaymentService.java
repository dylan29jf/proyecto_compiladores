/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.models;

/**
 *
 * @author dylan
 */
public class PaymentService {

    private String id;
    private String name;
    private String lastname;
    private String email;
    private String celphone;
    private String service;
    private String amount;

    public PaymentService() {
    }

    public PaymentService(String id, String name, String lastname, String email, String celphone, String service, String amount) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.celphone = celphone;
        this.service = service;
        this.amount = amount;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCelphone() {
        return celphone;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    

}
