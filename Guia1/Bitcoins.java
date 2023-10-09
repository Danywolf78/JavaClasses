
/*Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares. */

import java.util.Scanner;

public class Bitcoins {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantida de Bitcoins que desea cambiar a Dolares");
        double cantidad = sc.nextDouble();
        int valorBitcoins = 50000;
        double cambio = (cantidad * valorBitcoins);
        System.out.println(cantidad + " Bitcoins equivalen a : " + cambio + " Dolares");
        sc.close();
       
    }
}
