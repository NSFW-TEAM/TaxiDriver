package com.mycompany.firstproyect;

/**
 *
    * @author NSFW TEAM
 */

public class usuarioClase{

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public usuarioClase() {
        this.username = "maricon";
        this.password = "contraseña";
    }
    
    public usuarioClase(String username) {
        this.username = username;
        this.password = "contraseña";
    }

    public usuarioClase(String username,String password) {
        this.username = username;
        this.password = password;
    }
    
    private String username;
    private String password;
    
}
