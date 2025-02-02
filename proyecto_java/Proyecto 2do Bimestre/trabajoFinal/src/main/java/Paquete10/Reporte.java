/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete10;

/**
 *
 * @author Usuario Win11
 */
public class Reporte {
    public static String obtenerReporte(int [] contadores,String [] actividades ){
        int i;
        String cadena = "";
        for(i = 0; i < 7; i++){
            cadena = String.format("%s%d. Numero de participantes de%s:%d\n",
                    cadena,
                    i + 1,
                    actividades[i],
                    contadores[i]);
        }
        return cadena;
    }
}
