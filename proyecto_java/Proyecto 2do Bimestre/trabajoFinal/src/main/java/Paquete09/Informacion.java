/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete09;

/**
 *
 * @author Usuario Win11
 */
public class Informacion {

    public static String obtenerInformacion(int contador) {
        String mensaje;
        mensaje = String.format("Total de actividades creadas: %s\n", contador);
        if (contador == 0) {
            mensaje = String.format("%sMala campaña, debemos mejorar",
                    mensaje);
        } else {
            if (contador >= 1 && contador <= 5) {
                mensaje = String.format("%sPara participación en el club, hay que mejorar",
                        mensaje);
            } else {
                if (contador >= 6 && contador <= 15) {
                    mensaje = String.format("%sBuena participación, sigue así",
                            mensaje);
                } else {
                    if (contador >= 16) {
                        mensaje = String.format("%sExcelente campaña del club",
                                mensaje);
                    }
                }
            }

        }

        return mensaje;

    }
}
