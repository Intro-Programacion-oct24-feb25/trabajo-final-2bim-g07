/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinaljava;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class ProyectoFinalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean bandera = true;
        int numero;
        String salida;
        while (bandera) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese un numero para el registro\n1.Futbol\n"
                    + "2.Natacion\n3.Altetismo\n4.Basquetbol\n5.Ciclismo\n6.Tenis\n"
                    + "7.Yoga");
            numero = entrada.nextInt();
            if (numero == 1) {
                registrarParticipanteFutbol();
            } else {
                if (numero == 2) {
                    registrarParticipanteNatacion();
                } else {
                    if (numero == 3) {
                        registrarParticipanteAtletismo();
                    } else {
                        if (numero == 4) {
                            registrarParticipanteBasquetbol();
                        } else {
                            if (numero == 5) {
                                registrarParticipanteCiclismo();
                            } else {
                                if (numero == 6) {
                                    registrarParticipanteTenis();
                                } else {
                                    if (numero == 7) {
                                        registrarParticipanteYoga();
                                    }
                                }else{
                                   System.out.println("Esta actividad no esta"
                                           + "disponible en el club");
                               }
                            }
                        }
                    }
                }
            }
            System.out.println("Ingrese (si) para salir del ciclo");
            salida = entrada.nextLine();
            if(salida.equals("si")){
                bandera = false;
            }
        }
    }
}
