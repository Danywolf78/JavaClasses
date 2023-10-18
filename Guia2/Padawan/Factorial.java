/*Realizar un programa que calcule el factorial de un número*/

import java.util.Scanner;

public class  Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Ingrese un numero para factorizar"));
        int numero=sc.nextInt();
        int resultado= 1;
        for(int i=1;i <= numero; i++ ){
            
            resultado = resultado*i;

            

        }
        System.out.println(" El Factorial de: "+ numero+" es igual a: "+ resultado);
        sc.close();
        
    }
    
}