package clase.Guia1;

public interface conversion {
    public static void main(String[] args) {
        int kg = 130;
        int constGr= 1000;
        double consLb= 453.592;
        double resultado = (kg*constGr)/consLb;
        System.out.println("Mi peso es : "+ kg +" en kg y en Libras "+ resultado+ " Lb" );

    }
}
