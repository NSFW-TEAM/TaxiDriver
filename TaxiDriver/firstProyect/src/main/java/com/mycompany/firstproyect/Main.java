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
        
        ArrayList <HashMap> listaColecciones= new ArrayList<HashMap>();
        HashMap<String, pasajeroClase> mapaPasajeros = new HashMap<String, pasajeroClase>();
        HashMap<String, ConductorClase> mapaConductor = new HashMap<String, ConductorClase>();
        HashMap<String, adminClase> mapaAdmin = new HashMap<String, adminClase>();
        File file = new File("Archivos/pasajeros.csv");
        File file2 = new File("Archivos/choferes.csv");
        File file3 = new File("Archivos/autos.csv");
        File file4 = new File("Archivos/admins.csv");
        BufferedReader lector = new BufferedReader(new FileReader(file));
        BufferedReader lector2 = new BufferedReader(new FileReader(file2));
        BufferedReader lector3 = new BufferedReader(new FileReader(file3));
        BufferedReader lector4 = new BufferedReader(new FileReader(file4));
        String row;
        String row2;
        String row3;
        String row4;
        String dato[]= new String[3];
        String dato2[]= new String[5];
        String dato3[]= new String[6];
        String dato4[]= new String[4];
        
        while((row3 = lector3.readLine())!= null && (row2=lector2.readLine())!=null){
            dato3=row3.split(",");
            dato2=row2.split(",");
            AutoClase auto= new AutoClase(dato3[0],dato3[1],dato3[2],dato3[3],Integer.parseInt(dato3[4]));
            if(dato2[3].equals(dato3[5])){
                    ConductorClase conductor= new ConductorClase(Float.parseFloat(dato2[0]),auto,dato2[1],dato2[2],dato2[3],Integer.parseInt(dato2[4]));
                    mapaConductor.put(conductor.getRut(), conductor);
                }
        }
        
        while((row = lector.readLine())!= null){
            dato = row.split(",");
            pasajeroClase user = new pasajeroClase(dato[0],dato[1],dato[2]);
            mapaPasajeros.put(user.getRut(), user);
                        
        }
        
        while((row4 = lector4.readLine())!= null){
            dato4 = row4.split(",");
            adminClase admin = new adminClase(dato4[0],dato4[1],dato4[3]);
            mapaAdmin.put(admin.getRut(), admin);
                        
        }
        
        listaColecciones.add(mapaAdmin);
        listaColecciones.add(mapaConductor);
        listaColecciones.add(mapaPasajeros);
        
        
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