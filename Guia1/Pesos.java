/*Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros. */

import java.util.Scanner;

public class Pesos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantida de Pesos que desea cambiar a Libras");
        int cantidad = sc.nextInt();
        int valorEuro = 20;
        int cambio = (cantidad / valorEuro);
        System.out.println("Por "+cantidad+" Pesos, puede comprar "+cambio+" Euros");
        sc.close();
    }
}
