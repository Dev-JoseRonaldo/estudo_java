package POO.example;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setFabricante("BMW");
        meuCarro.setAnoFabricacao(2020);
        meuCarro.setCor("Azul");
        meuCarro.setModelo("125478");
        meuCarro.setPrecoCompra(45000.0);
        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.setNome("Ronaldo");
        meuCarro.proprietario.setCpf("703.968.854.63");
        meuCarro.proprietario.setAnoNascimento(1998);

        Carro carro2 = new Carro();
        carro2.setFabricante("Ford");
        carro2.setAnoFabricacao(2019);
        carro2.setCor("Verde");
        carro2.setModelo("512451");
        carro2.setPrecoCompra(92000.0);
        carro2.proprietario = new Pessoa();
        carro2.proprietario.setNome("Luiz");
        carro2.proprietario.setCpf("107.201.458-74");
        carro2.proprietario.setAnoNascimento(2000);

        meuCarro.listarPropriedades();
        meuCarro.imprimirResumoDepreciacao();

        carro2.listarPropriedades();
        carro2.imprimirResumoDepreciacao();


    }
}