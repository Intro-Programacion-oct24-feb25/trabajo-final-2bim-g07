/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario Win11
 */
public class Futbol {
    public static String registrarParticipanteFutbol(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int edad;
        String posicion;
        String ciudad;
        String equipo;
        String cadena = "Resumen:\n";
        
        System.out.println("Ingrese el nombre del participante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la posición favorita del participante");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la edad del participante");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el equipo favorito del participante");
        equipo = entrada.nextLine();
        
        cadena = String.format("%sNombre:%s\nEdad:%d\nPosicion:%s\nCiudad:%s\n"
                + "Equipo favorito:%s\n\n",
                cadena,
                nombre,
                edad,
                posicion,
                ciudad,
                equipo);
        return cadena;
    }
}
