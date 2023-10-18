import java.util.Scanner;

/*La suma de los primeros: Realizar un programa que calcule la suma de los
primeros N números naturales, donde N es un número entero guardado en memoria */
public class Sumatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero natural");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Debe introducir un numero mayor a cero");

        } else {
            int resultado = 0;
            
            for (int i = 1; i <= numero; i++){
                resultado += i;
            }
            System.out.println("La suma de los primeros " + numero + " números naturales es: "+ resultado );
        }
        sc.close();

        

    }
}

