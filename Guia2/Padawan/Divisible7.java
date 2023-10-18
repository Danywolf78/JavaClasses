/*Realizar un programa que muestre por pantalla los
números enteros positivos que sean divisibles por 7 y que sean menores que 100. */

public class Divisible7 {
    public static void main(String[] args) {
        int numero = 100;
        //int divisible=0;
        for (int i = 1;i < numero; i++ ){
            
            if (i % 7 == 0 ){
                System.out.println(i+" Es divisible por 7 y es mayor que cero");
            }
        }
    }
    
}
