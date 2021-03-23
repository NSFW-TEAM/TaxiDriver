package com.mycompany.firstproyect;
import javax.swing.JFrame;
import java.util.*;
/**
 *
 * @author NSFW TEAM
 */

public class Main {
    
    public static void main(String[] args){
        
        boolean user = false;
        HashMap mapaUsuarios = new HashMap();
        usuarioClase user1= new usuarioClase("Angel","password123","20673437k");
        
        if (!user){
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