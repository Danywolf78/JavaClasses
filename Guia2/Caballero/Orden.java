package Guia2.Caballero;

import java.util.Arrays;
import java.util.Scanner;

/*Realizar un programa que guarde cierta cantidad de números con
punto decimal en un arreglo. Luego, el programa debe ordenar los números de
forma ascendente y mostrarlos en pantalla. */
public class Orden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos elementos desea que tenga el Arreglo");
        int elementos = sc.nextInt();
        double[] arreglo = new double[elementos];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese valores decimales al Arreglo :");
            arreglo[i] = sc.nextDouble();

        }
        Arrays.sort(arreglo);
        System.out.println(Arrays.toString(arreglo));
        sc.close();

    }
}
