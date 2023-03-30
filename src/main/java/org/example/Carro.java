package org.example;

import java.util.Calendar;
import java.util.Date;

public class Carro {

    private String fabricante;
    private String modelo;
    private String cor;
    private int anoFabricacao;

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    private double precoCompra;
    Pessoa proprietario;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void listarPropriedades() {
        System.out.println("\nPropriedades do carro:");
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano de fabricação: " + this.anoFabricacao);
        System.out.println("\nProprietário: ");
        System.out.println("nome: " + this.proprietario.getNome());
        System.out.println("Cpf: " + this.proprietario.getCpf());
        System.out.println("Ano de nascimento: " + this.proprietario.getAnoNascimento());
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

    public double calcularValorRevenda() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int ano = calendar.get(Calendar.YEAR);

        int tempoDeUsoEmAnos = ano - this.anoFabricacao;

        double valorRevenda = (precoCompra / 20) * (20 - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}
