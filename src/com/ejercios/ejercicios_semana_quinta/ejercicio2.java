package com.ejercios.ejercicios_semana_quinta;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n1 = datos.nextInt();
        int contador = 0;
        boolean primo = false;
        for (int i = 1 ; i<=n1; i++){
            if (n1 % i == 0){
                contador++;
            }
        }
        if ((contador ==2) & (n1<=100)){
            primo = true; System.out.println("El número es primo y menor o igual que 100 " + primo);}
        else if ((n1<=100) &(contador!=2)){
            System.out.println("El número es menor o igual que 100 pero no es primo " + primo);
        } else if (contador ==2) {
            primo = true;System.out.println("El número es primo pero mayor que 100 " + primo);
        } else {
            System.out.println("Error");
        }
    }
}


//Crea un programa que reciba por parámetro un número introducido por el
//usuario y compruebe, si no es mayor que 100, si es primo o no, devolviendo
//un valor booleano true o false y muéstralo por pantalla.
// i es la variable que va a recorrer en el bucle
// i < n1 es donde para el recorrido (es una condición), mientras se cumpla recorro el bucle