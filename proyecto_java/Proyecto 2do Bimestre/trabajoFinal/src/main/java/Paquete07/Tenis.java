/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete07;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario Win11
 */
public class Tenis {
    public static String registrarParticipanteTenis(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String mano;
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
        System.out.println("Ingrese la mano hábil del participante"
                + "(derecha/izquierda)");
        mano = entrada.nextLine();
        
        cadena = String.format("%sNombre:%s\nEdad:%d\nNivel:%s\nCiudad:%s\n"
                + "Mano habil:%s\n\n",
                cadena,
                nombre,
                edad,
                nivel,
                ciudad,
                mano);
        return cadena;
    }
}
