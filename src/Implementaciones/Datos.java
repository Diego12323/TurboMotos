/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.SimpleFormatter;
/**
 *
 * @author stink
 */
public class Datos {
    //Nuemro de vetnas 
    public static int ventas=0;
    public static double monto=0;
    //Datos de las motos 
    //Codigo, modelo, cilindrada,año,precio
    public static String dG[][]={
        {"","","","",""},
        {"CD-00","FZ-16","153","2016","7000"},
        {"CD-01","FZ-25","249","2018","12600"},
        {"CD-02","YZF-R15","149","2017","13200"},
        {"CD-03","YZF-R3","321","2018","21900"},
        {"CD-04","YZF-R1M","998","2018","72000"}
    };    
    //Cantidad por modelo y vendidas
    public static int cant[][]={
        {0,0},
        {14,0},
        {19,0},
        {17,0},
        {18,0},
        {16,0}
    };
    //Ventas por modelo
    public static double venta[]={
        0,
        0,
        0,
        0,
        0,
        0
    };
    //Descuento y porcentaje
    public static String desc[][]={
        {"15000","0.05"},
        {"5","0.08"},
        {"Contado","0.10"},
        {"Tarjeta","0.05"},
        {"0.15"}//Igv
    };
    //Obsequio
    public static String obs[]={
        "",//0
        "Polo",//1
        "Llavero",//2
        "Casaca",//3
        "Casco",//4
        "Funda",//5
        "Mochila",//6
        "Gorra",//7
        "Protector",//8
        "Guantes",//9
        "Gafas",//10
        "Rodilleras",//11
        "Reloj",//12
        "Maletero",//13
        "Luces",//14
        "Agenda"//15
    };
    //Conteo de obsequios
    public static int cantObs[]={
        0,//0
        0,//1
        0,//2
        0,//3
        0,//4
        0,//5
        0,//6
        0,//7
        0,//8
        0,//9
        0,//10
        0,//11
        0,//12
        0,//13
        0,//14
        0,//15           
    };
    //Metodo para el formato del nombre
    public static String nombre(String art){
        //Cambia el formato al formato correcto del nombre de los obsequios
        String aux="";
        for (int i = 0; i < art.length(); i++) {
            if (i==0) {
                aux=aux.concat(String.valueOf(art.charAt(i)).toUpperCase());
            }else{
                aux=aux.concat(String.valueOf(art.charAt(i)).toLowerCase());
            }                    
        }
        return aux;
    }
    //Retorna la fecha actual
    public static String Fecha(){
        Date date = new Date();
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/YYYY");
        return fecha.format(date);
    }
    //Retorna el año presente
    public static String hora(){
        Date dt = new Date();
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
        return hora.format(dt);
    }
    public static String anio(){
        Date date = new Date();
        SimpleDateFormat anio = new SimpleDateFormat("YYYY");
        return anio.format(date);
    }
    //Retorna la suma total de un arreglo segun su indice
    public static int sumaE(int arreglo[][]){
        int suma=0;
        for (int i = 1; i < arreglo.length; i++) {              
            suma+=arreglo[i][1];
        }
        return suma;
    }
    public static int sumaE(int arreglo[]){
        int suma=0;
        for (int i = 1; i < arreglo.length; i++) {              
            suma+=arreglo[i];
        }
        return suma;
    }
    //Redondeo de cifras
    public static double redondedo(double numero){
        double redondo;
        redondo=(Math.round(numero)*100/100);
        return redondo;
    }
    //Imprimir asteriscos
    public static String asteriscos(int n){
        String cadena="";
        for (int i = 0; i < n; i++) {
            cadena+="*";
        }
        return cadena;
    }
    public static void  Reporte(String mensaje){
        try(
                //Creacion de fichero y objeto de escritura
                BufferedWriter bw = new BufferedWriter
                                    (new FileWriter("D:\\Reporte.txt",true));
            ) 
        {
            bw.newLine();
            for (int i = 0; i < mensaje.length(); i++) {
                if ((String.valueOf(mensaje.charAt(i)).equals("\n"))) {
                    bw.newLine();
                }else{
                    bw.write(String.valueOf(mensaje.charAt(i)));
                }
            }            
            bw.newLine();
            bw.flush();   
            v_Exito ve = new v_Exito();
            ve.msj="Archivado";
            ve.msj2="Correctamente";
            ve.setVisible(true);
        } catch (IOException e) {
            System.out.println("Error de escritura de reporte");
        }
    }
    public static String Historial(){
        //Declaraacion de cadena de retorno
        String mensaje="";
        try (
                //Lectura de fichero y variable de lectura
                BufferedReader br = new BufferedReader
                                    (new FileReader("D:\\Reporte.txt"));
        ){
            //Declaracion de cadena auiliar
            String aux;
            while ((aux=br.readLine())!=null) {
                mensaje+=aux+"\n";
            }  
        } catch (IOException e) {
            System.out.println("Error de lectura de reporte");
        }
        return mensaje;//Retorno de cadena
    }
    /*Creado por Jorge ARELLANO ZUBIATE
    E-MAIL: stink2889@gmail.com 
    Año 2018 Ciclo 01 Turno Noche*/
    
}
