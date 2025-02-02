/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Paquete01;

import java.util.Locale;
import java.util.Scanner;
import Paquete02.Futbol;
import Paquete03.Natacion;
import Paquete04.Atletismo;
import Paquete05.Basquetbol;
import Paquete06.Ciclismo;
import Paquete07.Tenis;
import Paquete08.Yoga;
import Paquete09.Informacion;
import Paquete10.Reporte;

/**
 *
 * @author Usuario Win11
 */
public class TrabajoFinal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        int numero;
        int contador = 0;
        String mensaje;
        int[] contadores = new int[7];
        String reporte;
        String[] actividades = {"Futbol", "Natacion", "Atletismo", "Basquetbol",
            "Ciclismo", "Tenis", "Yoga"};
        String salida;

        while (bandera == true) {
            System.out.println("Ingrese un numero para el registro\n1)"
                    + "Futbol\n2)Natacion\n3)Atletismo\n"
                    + "4)Basquetbol\n5)Ciclismo\n6)Tenis\n7)Yoga\n");
            numero = entrada.nextInt();
            if (numero == 1) {
                Futbol.registrarParticipanteFutbol();
                contadores[numero - 1] = contadores[numero - 1] + 1;
            } else {
                if (numero == 2) {
                    Natacion.registrarParticipanteNatacion();
                    contadores[numero - 1] = contadores[numero - 1] + 1;
                } else {
                    if (numero == 3) {
                        Atletismo.registrarPaticipanteAtletismo();
                        contadores[numero - 1] = contadores[numero - 1] + 1;
                    } else {
                        if (numero == 4) {
                            Basquetbol.registrarPaticipanteBasquetbol();
                            contadores[numero - 1] = contadores[numero - 1] + 1;
                        } else {
                            if (numero == 5) {
                                Ciclismo.registrarParticipanteCiclismo();
                                contadores[numero - 1] = contadores[numero - 1] + 1;
                            } else {
                                if (numero == 6) {
                                    Tenis.registrarParticipanteTenis();
                                    contadores[numero - 1] = contadores[numero - 1] + 1;
                                } else {
                                    if (numero == 7) {
                                        Yoga.registrarParticipanteTenis();
                                        contadores[numero - 1] = contadores[numero - 1] + 1;
                                    } else {
                                        System.out.println("Esta actividad no "
                                                + "esta disponible en el club");
                                        contador = contador - 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Ingrese (si) para salir del ciclo");
            entrada.nextLine();
            salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
            contador = contador + 1;
        }
        mensaje = Informacion.obtenerInformacion(contador);
        System.out.printf("%s", mensaje);
        reporte = Reporte.obtenerReporte(contadores, actividades);
        System.out.printf("%s", reporte);
    }
}
