package com.mycompany.firstproyect;
import javax.swing.JFrame;
import java.io.*;
/**
 *
    * @author NSFW TEAM
 */

public abstract class usuarioClase{
    
    private String username;
    private String password;
    private String rut;

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
    
    
}

class ConductorClase extends usuarioClase{
    
    private float calificación;
    private int ganancias;
    private AutoClase auto;
    
    public void setCalificación(float calificación) {
        this.calificación = calificación;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public void setAuto(AutoClase auto) {
        this.auto = auto;
    }
    
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
   
    
    
    
    public int viaje(int pasajeros){
       return this.auto.getCapacidad()-pasajeros; 
       /*Retorna la capacidad del auto, 
       luego de ser tomado por nuevos pasajeros.
       */
    }
    
    public String viaje(String enViaje){
        return enViaje; 
        /*Retorna un mensaje del conductor, 
        donde muestra que esta en un viaje, 
        pero sin pasajeros o haciendo un delivery.
        */
    }
    
    
    
    
}

class pasajeroClase extends usuarioClase{
    
    private int saldo;
    private int claveTarjeta;
    
    public pasajeroClase(String username, String password, String rut) {
        super(username, password, rut);
    }   
    
    public void pedirTaxi(){
        System.out.println("estamos trabajando en ello");
    }
    
    public void calificar(){
        System.out.println("estamos trabajando en ello");
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public int getClaveTarjeta() {
        return claveTarjeta;
    }

    public void setClaveTarjeta(int claveTarjeta) {
        this.claveTarjeta = claveTarjeta;
    }
    
    public void pagar(int monto, ConductorClase conductor, int clave) throws IOException{
        
        if(clave==0000){ //El usuario ingresa la clave de su tarjeta por pantalla y el monto disponible.
            BufferedReader lector = new BufferedReader( new InputStreamReader( System.in ) );
            String aux;
            System.out.println("Ingrese clave de tarjeta");
            aux = lector.readLine();
            claveTarjeta = Integer.parseInt(aux);
            pasajeroClase.this.setClaveTarjeta(claveTarjeta);
            System.out.println("Ingrese el saldo de tarjeta");
            aux = lector.readLine(); 
            saldo = Integer.parseInt(aux);
            pasajeroClase.this.setSaldo(saldo);         
        }
        else{
            if(clave != pasajeroClase.this.getClaveTarjeta() || monto>pasajeroClase.this.getSaldo() ){
                System.out.println("ERROR: Clave Incorrecta o Saldo Insuficiente");
                return;
            }
        }
        
        pasajeroClase.this.setSaldo(pasajeroClase.this.getSaldo()-monto);
        conductor.setGanancias(conductor.getGanancias()+monto);
             
    }
    
    public void pagar(int monto, ConductorClase conductor){
        conductor.setGanancias(conductor.getGanancias()+monto);
        /*
        este metodo actualiza las ganancias del chofer, 
        luego de haber sido pagado en efectivo por parte
        del pasajero.
        */
    }



}

class adminClase extends usuarioClase{

    public adminClase(String username, String password, String rut){
        super(username, password, rut);
    }
    public void mostrarConductores(){
        //Esta funcion mostrara a cada conductor disponible en la zona 
    }

    public void mostrarPasajeros(){
        //Esta funcion mostrara a los usuario de la aplicacion 
    }

    public void penalizarConductor(){
        //
    }
    
    
}