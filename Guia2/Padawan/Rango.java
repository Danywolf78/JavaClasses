import java.util.Scanner;
/*Escribir un programa que encuentre la suma de los
números impares en un rango de números enteros guardados en una variable. */
public class Rango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo: ");
        int numero = sc.nextInt();
        int contador = 0;
        if (numero > 0)
            for (int i = 1; i < numero; i++) {
                if (i % 2 == 0) {
                    continue;
                } else {
                    contador += i;
                }
                System.out.println("La sumatoria de numeros impares desde 0 a " + numero + " es igual a: " + contador);

            }
        else {
            System.out.println("Ingrese un numero positivo mayor que cero");

        }

        sc.close();
    }
}
