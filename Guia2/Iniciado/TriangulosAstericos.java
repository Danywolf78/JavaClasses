
    public class TriangulosAstericos {

        public static void main(String[] args) {
            int altura = 5; // Altura del triángulo
            
            for (int i = 1; i <= altura; i++) {
                // Imprime asteriscos en la fila actual
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                
                // Salto de línea para la siguiente fila
                System.out.println();
            }
        }
    }

