package com.ejercios.ejercicios_semana_quinta;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n1 = datos.nextInt();
        System.out.println("Introduce otro número");
        int n2 = datos.nextInt();
        int resultado =  n1 % n2;
        if (resultado == 0){
            System.out.println("True, son múltiplos");
        }else {
            System.out.println("False, no son múltiplos");
        }

    }
}


//Crear un programa que reciba por parámetros dos números que haya introducido el usuario y devuelva si son múltiplos o no con un booleano true o false y muéstralo por pantalla.