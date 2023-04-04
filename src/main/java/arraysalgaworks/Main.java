package arraysalgaworks;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        int[] notas3 = new int[5];
//        int[] notas2 = new int[]{8, 5, 4, 9, 10};

        Integer[] notas = {5, 10, 1, 9, 4};

        System.out.println("A média das notas dos alunos é: " + Calculadora.calcularMedia(notas));

        //usando o metodo toString do objeto Array para imprimir o array
        System.out.println("Notas: " + Arrays.toString(notas));

        //ordenando Arrays
        Arrays.sort(notas);
        System.out.println("Notas Ordenadas Crescente: " + Arrays.toString(notas));

        Arrays.sort(notas, Comparator.reverseOrder());
        System.out.println("Notas Ordenadas Decrescente: " + Arrays.toString(notas));

    }
}
