/*Conversión de dólares a pesos: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.*/

import java.util.Scanner;

public class Dolares {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la cantida de Pesos que desea cambiar a Dolares");
        int cantidad = sc.nextInt();
        int valorDolar = 20;
        int  cambio= (cantidad/valorDolar);
        System.out.println("Puede comprar "+ cambio + " Dolares, por sus "+cantidad+" Pesos" );   
        sc.close();    
    }
}
