import java.util.Scanner;

public class Pares {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero natural");
        int numero = sc.nextInt();
        int resultado = 0;
                  
        for (int i = 1; i <= numero; i++){
             resultado += i;
            if (resultado % 2 == 0){
                System.out.println( resultado +" Es par");
            }
            }
            sc.close();
        }
        
    }

