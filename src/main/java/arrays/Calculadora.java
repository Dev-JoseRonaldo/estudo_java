package arrays;

public class Calculadora {

    static double calcularMedia(Integer[] numeros) {
        int total = 0;

        //for-each
        for (int numero : numeros) {
            total += numero;
        }
        
//        for(int i = 0; i < numeros.length; i++) {
//            total += numeros[i];
//        }

        return (double) total / numeros.length;
    }
}
