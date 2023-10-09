import java.util.Scanner;

public class Libras {
    /*
     * Conversión de libras esterlinas a dólares: Escribir un programa en Java que
     * solicite al usuario una cantidad en libras esterlinas y muestre el
     * equivalente en
     * dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de
     * cambio es de 1
     * libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el
     * programa
     * deberá mostrar 70 dólares.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantida de Libras Esterlinas que desea cambiar a Dolares");
        int cantidad = sc.nextInt();
        Double valorDolar = 1.4;
        Double cambio = (cantidad * valorDolar);
        System.out.println(cambio+" Dolares equivalen a : "+cantidad+" Libras Esterlinas");
        sc.close();
    }
}
