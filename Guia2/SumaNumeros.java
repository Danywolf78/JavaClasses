
/*Suma de números : Realizar un programa que guarde un número en memoria y
determine si es par o impar. */

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero  :");

        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " Es un numero Par");
        } else if(numero % 2 != 0) {
            System.out.println(numero + " Es un numero Impar");
        }
        

        sc.close();

    }


}
