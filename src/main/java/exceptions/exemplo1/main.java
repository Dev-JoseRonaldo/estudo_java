package exceptions.exemplo1;

import exceptions.exemplo1.entites.Produto;

public class main {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);
        produto.ativar();

        produto.retirarEstoque(5);
        System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());
    }
}
