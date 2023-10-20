package Guia2.Caballero;

import java.util.Arrays;
import java.util.Scanner;

/*Realizar un programa donde se guarden 5 en
un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo
de los números ingresados. */
public class Ordenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creo el arreglo de numeros enteros
        int[] numeros = new int[5];

        // Lleno el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero para la posicion :" + i + " del arreglo");
            numeros[i] = sc.nextInt();
        }

        // Busco el valor maximo del array
        int maxArray = numeros[0];
        for (int n : numeros) {
            if (n > maxArray) {
                maxArray = n;
            }
        }
        System.out.println("El mayor numero del array es :" + maxArray);

        // Busco el valor minimo del array
        int minArray = numeros[0];
        for (int j : numeros) {
            if (j < minArray) {
                minArray = j;
            }
        }
        System.out.println("El menor numero del array es :" + minArray);

        // Ordeno el Array
        // Arrays.sort(numeros);
        // Imprimo y cambio el formato
        // System.out.println(Arrays.toString(numeros));
        sc.close();

    }
}
