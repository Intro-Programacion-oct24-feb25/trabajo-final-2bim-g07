/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario Win11
 */
public class Atletismo {

    public static String registrarPaticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        double record;
        String cadena = "Resumen:\n";

        System.out.println("Ingrese el nombre del participante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la especialidad del participante "
                + "(Carreras, Saltos, Lanzamiento)");
        especialidad = entrada.nextLine();
        System.out.println("Ingrese la edad del participante");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el record personal del participante");
        record = entrada.nextDouble();

        cadena = String.format("%sNombre:%s\nEdad:%d\nEspecialidad:%s\nCiudad:%s\n"
                + "Record:%.2f\n\n",
                cadena,
                nombre,
                edad,
                especialidad,
                ciudad,
                record);
        return cadena;

    }
}
