import java.util.Scanner;

public class SumaNumeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero  :");

        int numero = sc.nextInt();

        if (numero % 2 == 0 && numero != 0) {
            System.out.println(numero + " Es un numero Par");
        } else if(numero % 2 != 0) {
            System.out.println(numero + " Es un numero Impar");
        }else{
            System.out.println("Ingresaste lo  "+ numero);
        }
        

        sc.close();
    }
}
