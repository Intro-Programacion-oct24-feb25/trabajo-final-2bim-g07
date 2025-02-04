/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete06;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario Win11
 */
public class Ciclismo {
    public static String registrarParticipanteCiclismo(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int edad;
        String tipo;
        String ciudad;
        String marca;
        String cadena = "Resumen:\n";
        
        System.out.println("Ingrese el nombre del participante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de ciclismo (Montaña, Ruta, Urbano)");
        tipo = entrada.nextLine();
        System.out.println("Ingrese la edad del participante");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la marca favorita del participante");
        marca = entrada.nextLine();
        
        cadena = String.format("%sNombre:%s\nEdad:%d\nTipo:%s\nCiudad:%s\n"
                + "Marca favorita:%s\n\n",
                cadena,
                nombre,
                edad,
                tipo,
                ciudad,
                marca);
        return cadena;
    }
}
