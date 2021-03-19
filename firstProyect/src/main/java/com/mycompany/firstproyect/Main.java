package com.mycompany.firstproyect;
import javax.swing.JFrame;
/**
 *
 * @author NSFW TEAM
 */

public class Main {
    
    public static void main(String[] args){
        boolean user = false;
        usuarioClase user1= new usuarioClase("Angel","password123");
        user1.setUsername("juanito");
        //user1.setUserName("Francisco");
        
        if (!user){
            //Register
            System.out.println("lol");
            NewJFrame ventana = new NewJFrame();
            ventana.setVisible(true);
        }    
        
        //System.out.println(user1.getUsername());
        
        //user1.callTaxi();
    }
}