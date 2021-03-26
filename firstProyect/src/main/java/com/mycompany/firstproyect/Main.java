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
        
        //COMO LEER CSV
        //en dependencies agregar la libreria opencsv:
        //buscamos en google la informacion correcta de la libreria, en este caso aquí: http://opencsv.sourceforge.net/dependency-info.html
        //ingresamos lo requerido (groupID = com.opencsv, artifactID = opencsv, version = 5.4) SI PONES INFO INCORRECTA NO FUNCIONA
        //luego clic derecho en la dependencia agregada "opencsv-5.4" y "instalar artefacto manualmente" elegimos el JAR del opencsv
        //libreria agregada
        //ponemos despues del main(String[] args): throws IOException , CsvException {...
        //importas las librerias requeridas que puse arriba con import
        //creamos un string con el directorio del csv a leer. NOTA: Las "\\" siempre van dobles
        String archivo = "C:\\carpeta\\archivo.csv";
        //creamos un reader que encuentre el archivo usando las librerias Files y Paths
        Reader reader = Files.newBufferedReader(Paths.get(archivo));
        //creamos un CsvReader y le ponemos en el parametro que lea el archivo que se encontró
        CSVReader lector = new CSVReader(reader);
        //creamos una variable para leer las lineas del CSV
        String[] fila;
        //mientras la próxima linea, que es igual a la variable "fila", no sea NULL
        while((fila = lector.readNext()) != null){
            //dice lo primero (representado por el 0) de la primera línea. Se avanza de línea usando el método readNext();
            System.out.println(fila[0]);
        }
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