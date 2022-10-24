package com.ejercios.ejercicios_semana_quinta;

import java.util.Scanner;

public class ejercicio4 {
    public static class figura {
        int lado ;
        int altura ;
        static int calculoArea(int l, int a) {
            figura cuadrilatero = new figura();
            cuadrilatero.altura = a;
            cuadrilatero.lado = l;
            int resultado =  cuadrilatero.altura * cuadrilatero.lado ;
            return resultado;
        }

        public static void main(String[] args) {
            Scanner datos = new Scanner(System.in);
            System.out.println("Introduce un valor para el lado");
            int n1 = datos.nextInt();
            System.out.println("Introduce un valor para la altura");
            int n2 = datos.nextInt();
            System.out.println("El resultado del área es " + calculoArea(n1,n2));
        }
    }
}







/*
Crea un programa que reciba por parámetro lado y altura y cree un objeto
Cuadrilátero con estas propiedades. Haz que tenga una función llamada
calculoArea() que muestre por pantalla el resultado.
*/
