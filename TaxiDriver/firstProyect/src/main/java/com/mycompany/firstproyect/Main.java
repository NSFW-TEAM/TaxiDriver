package com.mycompany.firstproyect;
import javax.swing.JFrame;
import java.util.*;
//CSV LIBS
import java.nio.file.Files; //para identificar el archivo
import java.nio.file.Paths; //para encontrar el archivo
import java.io.*; //para varias cosas (entre ellas el IOException)
import java.io.Reader; //para el reader
import com.opencsv.CSVReader; //para el CsvReader
import com.opencsv.exceptions.CsvException; //para el CsvException
//CSV LIBS
/**
 *
 * @author NSFW TEAM
 */

public class Main {
    
    public static void main(String[] args) throws IOException , CsvException {
        
        HashMap<String, pasajeroClase> mapaPasajeros = new HashMap<String, pasajeroClase>();
        HashMap<String, ConductorClase> mapaConductor = new HashMap<String, ConductorClase>();
        File file = new File("Archivos/pasajeros.csv");
        File file2 = new File("Archivos/choferes.csv");
        File file3 = new File("Archivos/autos.csv");
        BufferedReader lector = new BufferedReader(new FileReader(file));
        BufferedReader lector2 = new BufferedReader(new FileReader(file2));
        BufferedReader lector3 = new BufferedReader(new FileReader(file3));
        String row;
        String row2;
        String row3;
        String dato[]= new String[3];
        String dato2[]= new String[5];
        String dato3[]= new String[6];
        
        while((row3 = lector3.readLine())!= null && (row2=lector2.readLine())!=null){
            dato3=row3.split(",");
            dato2=row2.split(",");
            AutoClase auto= new AutoClase(dato3[0],dato3[1],dato3[2],dato3[3],Integer.parseInt(dato3[4]));
            if(dato2[3].equals(dato3[5])){
                    ConductorClase conductor= new ConductorClase(Float.parseFloat(dato2[0]),auto,dato2[1],dato2[2],dato2[3],Integer.parseInt(dato2[4]));
                    mapaConductor.put(conductor.getRut(), conductor);
                    AutoClase aux= conductor.getAuto();
                    System.out.println(aux.getModelo());
                }
        }
        
        while((row = lector.readLine())!= null){
            dato = row.split(",");
            pasajeroClase user = new pasajeroClase(dato[0],dato[1],dato[2]);
            mapaPasajeros.put(user.getRut(), user);
                        
        }
        
        
        
        System.out.println(mapaPasajeros.keySet());
        System.out.println(mapaConductor.keySet());
        
        
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
        
    }
    /*
    
       File file = new File("BASE/SEDES.txt");
    BufferedReader lector = new BufferedReader(new FileReader(file));
    while((row = lector.readLine())!= null){

                //Se Llena el arreglo Sedes con su informacion
                dato = row.split(";"); */
}