import java.util.Scanner;
/*Conversión de euros a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares. */
public class Euros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la cantida de Euros que desea cambiar a Dolares");
        int cantidad = sc.nextInt();
        Double valorDolar = 1.20;
        Double  cambio= (cantidad*valorDolar);
        System.out.println(cambio+" Dolares equivalen a : "+cantidad+" Euros" );   
        sc.close();    
    }
}
