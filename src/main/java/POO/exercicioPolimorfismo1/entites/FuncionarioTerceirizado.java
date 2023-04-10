package POO.exercicioPolimorfismo1.entites;

public class FuncionarioTerceirizado extends Funcionario{
    private Double despesaAdicional;

    public FuncionarioTerceirizado() {
        super();
    }

    public FuncionarioTerceirizado(String name, Integer horasTrabalhadas, Double valorPorHora, Double despesaAdicional) {
        super(name, horasTrabalhadas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public final Double pagamento() {
        return super.pagamento() + ( despesaAdicional * 1.1 );
    }
}
