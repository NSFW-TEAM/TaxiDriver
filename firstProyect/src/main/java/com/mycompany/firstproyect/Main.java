package com.mycompany.firstproyect;
import javax.swing.JFrame;
import java.util.*;
/**
 *
 * @author NSFW TEAM
 */

public class Main {
    
    public static void main(String[] args){
        
        pasajeroClase user0 = new pasajeroClase("Angel","password123","20673437k");
        pasajeroClase user1 = new pasajeroClase("Francisco","password123","203452319");
        pasajeroClase user2 = new pasajeroClase("Axel","password123","207389219");
        pasajeroClase user3 = new pasajeroClase("Darien","password123","13634427k");
        pasajeroClase user4 = new pasajeroClase("Carlos","password123","184342844");
        
        HashMap<String, pasajeroClase> mapaPasajeros = new HashMap<String, pasajeroClase>();
        
        mapaPasajeros.put(user0.getRut(), user0);
        mapaPasajeros.put(user1.getRut(), user1);
        mapaPasajeros.put(user2.getRut(), user2);
        mapaPasajeros.put(user3.getRut(), user3);
        mapaPasajeros.put(user4.getRut(), user4);
        
        System.out.println(mapaPasajeros.keySet());
        
        if (true){
            //Register
            NewJFrame ventana = new NewJFrame();
            ventana.setVisible(true);
        }
        else{
            //Aplicacion como tal
            App app = new App();
            app.setVisible(true);
        }
        
        System.out.println(user1.getUsername());
    }
}