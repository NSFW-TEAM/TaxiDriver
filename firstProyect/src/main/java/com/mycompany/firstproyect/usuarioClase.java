package com.mycompany.firstproyect;
import javax.swing.JFrame;

/**
 *
    * @author NSFW TEAM
 */

public class usuarioClase{

    public String getUsername() {
        return username;
    }
    
    public String getRut() {
        return rut;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }

    public usuarioClase(String username,String password,String rut) {
        this.username = username;
        this.password = password;
        this.rut = rut;
    }
    
    private String username;
    private String password;
    private String rut;
}

class ConductorClase extends usuarioClase{

    public void setCalificación(float calificación) {
        this.calificación = calificación;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public void setAuto(AutoClase auto) {
        this.auto = auto;
    }
    private float calificación;
    private int ganancias;

    public float getCalificación() {
        return calificación;
    }

    public int getGanancias() {
        return ganancias;
    }

    public AutoClase getAuto() {
        return auto;
    }
    
    public ConductorClase(float calificación, AutoClase auto, String username, String password, String rut, int ganancias) {
        super(username, password, rut);
        this.calificación = calificación;
        this.auto = auto;
        this.ganancias = ganancias;
    }
    
    private AutoClase auto;
}

class pasajeroClase extends usuarioClase{
    public pasajeroClase(String username, String password, String rut) {
        super(username, password, rut);
    }   
    
    public void pedirTaxi(){
        System.out.println("estamos trabajando en ello");
    }
    
    public void puntear(){
        System.out.println("estamos trabajando en ello");
    }
    
    public void pagar(){
        System.out.println("estamos trabajando en ello");
    }
}

class adminClase extends usuarioClase{

    public adminClase(String username, String password, String rut) {
        super(username, password, rut);
    }
    
}