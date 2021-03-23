/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstproyect;

/**
 *
 * @author NSFW TEAM
 */

public class AutoClase {

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setAñoFab(int añoFab) {
        this.añoFab = añoFab;
    }
    
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public AutoClase(String marca, String color, String modelo, String patente, int añoFab) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.patente = patente;
        this.añoFab = añoFab;
        this.capacidad=4;
    }
    
    public AutoClase(String marca, String color, String modelo, String patente) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.patente = patente;
        this.añoFab = 0;
        this.capacidad=4;
        //this.asientos = new boolean[capacidad];
        //this.asientos[0]=false;
        //this.asientos[1]=false;
        //this.asientos[2]=false;
        //this.asientos[3]=false;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public int getAñoFab() {
        return añoFab;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    //private boolean[] asientos;
    private int capacidad;
    private String marca;
    private String color;
    private String modelo;
    private String patente;
    private int añoFab;
}
