/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuario Win11
 */
public class Natacion {

    public static String registrarParticipanteNatacion() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estilo;
        String cadena = "Resumen:\n";

        System.out.println("Ingrese el nombre del participante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el nivel del participante "
                + "(Principiante, Intermedio, Avanzado)");
        nivel = entrada.nextLine();
        System.out.println("Ingrese la edad del participante");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el estilo favorito del participante");
        estilo = entrada.nextLine();

        cadena = String.format("%sNombre:%s\nEdad:%d\nNivel:%s\nCiudad:%s\n"
                + "Estilo favorito:%s\n\n",
                cadena,
                nombre,
                edad,
                nivel,
                ciudad,
                estilo);
        return cadena;
    }
}
