package POO.exercicioPolimorfismo1.entites;

public class Funcionario {
    private String name;
    private Integer horasTrabalhadas;
    private Double valorPorHora;

    public Funcionario() {
    }

    public Funcionario(String name, Integer horasTrabalhadas, Double valorPorHora) {
        this.name = name;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double pagamento() {
        return this.valorPorHora * horasTrabalhadas;
    }
}
