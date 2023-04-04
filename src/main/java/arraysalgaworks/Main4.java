package arraysalgaworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //adicionar elemento
        list.add("Maria Antônia");
        list.add("Ronaldo");
        list.add("Fernanda");
        list.add("Matheus");
        list.add("Militão");
        list.add("Leonardo");
        list.add("Fábio");

        //adicionar elemento em um index
        list.add(2,"Hebert");

        //tamanho da lista
        System.out.println("O tamanho da lista é: " + list.size());

        //remover elemento pelo valor
        list.remove("Ronaldo");

        //remover elemento pelo index
        list.remove(1);

        //remover pelo predicado (todos com inicial "M")
        list.removeIf(x -> x.charAt(0) == 'M');

        //encontrar o index de um elemento
        System.out.println("Index do Leonardo: " + list.indexOf("Leonardo"));

        for (String pessoa : list) {
            System.out.println(pessoa);
        }

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());
        System.out.println("\nLista Filtrada (letra F) :");
        for (String pessoa : result) {
            System.out.println(pessoa);
        }

        //encontrar primeiro elemento que começa com a letra F
        String primeiroLetraF = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);

        System.out.println("\nPrimeira pessoa que começa com a letra F: " + primeiroLetraF);
    }
}
