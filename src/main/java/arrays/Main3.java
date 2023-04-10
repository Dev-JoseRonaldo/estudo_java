package arrays;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] numerosJogo1 = { 25, 64, 17, 5, 32};

        System.out.println("Array original: " + Arrays.toString(numerosJogo1));

        //copiando arrays
        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, 3);
        int[] numerosJogo3 = Arrays.copyOf(numerosJogo1, numerosJogo1.length);

        System.out.println("Array copiado (length menor): " + Arrays.toString(numerosJogo2));
        System.out.println("Array copiado e expandido (length igual): " + Arrays.toString(numerosJogo3));

        //copiando e expandindo arrays
        int[] numerosJogo4 = Arrays.copyOf(numerosJogo1, numerosJogo1.length + 1);
        System.out.println("Array copiado e expandido (length maior): " + Arrays.toString(numerosJogo4));

        //excluindo elemento do array
        int indexDeExclusao = 2;
        int[] arrayInicial = { 25, 64, 17, 5, 32, 54, 21};
        int[] arrayFinal = new int[arrayInicial.length - 1];

        System.arraycopy(arrayInicial, 0 , arrayFinal, 0, indexDeExclusao);
        System.arraycopy(arrayInicial, indexDeExclusao + 1, arrayFinal, indexDeExclusao, arrayFinal.length - indexDeExclusao);

        System.out.println(Arrays.toString(arrayInicial));
        System.out.println(Arrays.toString(arrayFinal));

    }
}
