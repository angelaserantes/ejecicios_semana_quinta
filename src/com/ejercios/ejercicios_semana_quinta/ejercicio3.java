package com.ejercios.ejercicios_semana_quinta;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = datos.nextLine();
        int nLetras = palabra.length();
        for (int i =0; i <= nLetras; i ++){
            System.out.println(palabra.charAt(i));
        }
    }
}



/*
Crea un programa que reciba por parámetro una cadena de caracteres
introducida por el usuario y que muestre por pantalla cada caracter de
forma individual.
*/
