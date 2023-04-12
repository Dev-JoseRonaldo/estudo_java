package exceptions.exemplo1.entites;

import java.util.Objects;

public class Produto {
    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
//        primeira forma:
//        if(nome == null) {
//            throw new NullPointerException("Nome deve ser informado")
//        }

//      segunda forma:
        Objects.requireNonNull(nome, "Nome deve ser informado!");
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void retirarEstoque(int quantidade) {
        if (quantidade < 0) {

//            Forma detalhada:
//            IllegalArgumentException excecao = new IllegalArgumentException("Quantidade não pode ser negativa para retirada no estoque!");
//            throw excecao;

//          Forma mais comum
            throw new IllegalArgumentException("Quantidade não pode ser negativa para retirada no estoque!");
        }

        if(!isAtivo()) {
            throw new IllegalStateException("Retirada no estoque não pode ser realizada em produto inativo!");
        }

        if(this.quantidadeEstoque - quantidade < 0) {
            throw  new IllegalStateException("Quantidade inválida por que o estoque ficaria negativo!");
        }

        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }
}
