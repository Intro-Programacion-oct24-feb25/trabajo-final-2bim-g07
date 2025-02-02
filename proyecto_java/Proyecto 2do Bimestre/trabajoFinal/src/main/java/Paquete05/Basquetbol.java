/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario Win11
 */
public class Basquetbol {

    public static void registrarPaticipanteBasquetbol() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int edad;
        String posicion;
        String ciudad;
        double estatura;
        String cadena = "";

        System.out.println("Ingrese el nombre del participante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la posición preferida del participante");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la edad del participante");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la estatura del participante");
        estatura = entrada.nextDouble();

        cadena = String.format("%sNombre:%s\nEdad:%d\nPosicion favorita:%s\n"
                + "Ciudad:%s\nEstatura:%.2f\n",
                cadena,
                nombre,
                edad,
                posicion,
                ciudad,
                estatura);
        System.out.printf("Resumen:\n%s", cadena);

    }
}
