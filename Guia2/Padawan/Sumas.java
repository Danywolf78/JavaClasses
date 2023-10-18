/*Realizar un programa donde se guarde un número entero en una
variable y que imprima por pantalla el resultado de la suma de todos los números
enteros desde 1 hasta ese número. */

import java.util.Scanner;

public class Sumas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo ");
        int numero = sc.nextInt();
        int sumatoria = 0;
        if( numero > 0 ){
            for (int i=1; i<= numero; i++)
                sumatoria += i;
        }else{
            System.out.println("Ingrese numero positivo");

        }
        System.out.println("La sumatoria de 0 a "+ numero +" es igual a: "+sumatoria );
        sc.close();
    }
         

}
