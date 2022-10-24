package com.ejercios.ejercicios_semana_quinta;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("¿Qué operación quieres hacer?");
        String operacion = datos.next();
        if (operacion.equals("sumar")){
            System.out.println("Introduce un valor");
            int n1 = datos.nextInt();
            System.out.println("Introduce otro valor");
            int n2 = datos.nextInt();
            int resultado1 = n1 + n2;
            System.out.println("la suma es " + resultado1);
        } else if (operacion.equals("restar")) {
            System.out.println("Introduce un valor");
            int n3 = datos.nextInt();
            System.out.println("Introduce otro valor");
            int n4 = datos.nextInt();
            int resultado2 = n3 - n4;
            System.out.println("la resta es " + resultado2);
        } else if (operacion.equals("multiplicar")) {
            System.out.println("Introduce un valor");
            int n4 = datos.nextInt();
            System.out.println("Introduce otro valor");
            int n5 = datos.nextInt();
            int resultado3 = n4 * n5;
            System.out.println("la multiplicación es " + resultado3);
        } else if (operacion.equals("dividir")) {
            System.out.println("Introduce un valor");
            int n5 = datos.nextInt();
            System.out.println("Introduce otro valor");
            int n6 = datos.nextInt();
            int resultado4 = n5 / n6;
            System.out.println("la división es " + resultado4);
        }else {
            System.out.println("Esta calculadora no puede hacer esta operación");
        }
    }
}












//Crea un programa que permita usar una calculadora simple. Debe ofrecer al usuario la posibilidad de hacer sumas, restas, multiplicaciones y divisiones.