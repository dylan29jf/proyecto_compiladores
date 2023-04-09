/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_compiladores.models;

import java.util.Random;

/**
 *
 * @author dylan
 */
public class ClaveElector {

    String apellidoPaterno; 
    String apellidoMaterno;
    String nombre;
    int anioNacimiento;
    int mesNacimiento;
    int diaNacimiento;
    String entidadFederativa;
    String seccionElectoral;

    public ClaveElector() {
    }

    public ClaveElector(String apellidoPaterno, String apellidoMaterno, String nombre, int anioNacimiento, int mesNacimiento, int diaNacimiento, String entidadFederativa, String seccionElectoral) {
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.entidadFederativa = entidadFederativa;
        this.seccionElectoral = seccionElectoral;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public String getEntidadFederativa() {
        return entidadFederativa;
    }

    public void setEntidadFederativa(String entidadFederativa) {
        this.entidadFederativa = entidadFederativa;
    }

    public String getSeccionElectoral() {
        return seccionElectoral;
    }

    public void setSeccionElectoral(String seccionElectoral) {
        this.seccionElectoral = seccionElectoral;
    }

    

}
