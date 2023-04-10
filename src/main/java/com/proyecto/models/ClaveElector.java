/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.models;

import java.util.Random;

/**
 *
 * @author dylan
 */
public class ClaveElector {

    String apellidoPaterno; 
    String apellidoMaterno;
    String nombre;
    String anioNacimiento;
    String mesNacimiento;
    String diaNacimiento;
    String entidadFederativa;
    String seccionElectoral;
    String sexo;

    public ClaveElector() {
    }

    public ClaveElector(String apellidoPaterno, String apellidoMaterno, String nombre, String anioNacimiento, String mesNacimiento, String diaNacimiento, String entidadFederativa, String seccionElectoral, String sexo) {
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.entidadFederativa = entidadFederativa;
        this.seccionElectoral = seccionElectoral;
        this.sexo = sexo;
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

    public String getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(String anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public String getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(String diaNacimiento) {
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    

}
