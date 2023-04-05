package exerciciocomposicao1.entites;

import exerciciocomposicao1.entites.enums.NivelFuncionario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
    private String nome;
    private NivelFuncionario nivelFuncionario;
    private double salarioBase;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    //construtores
    public Funcionario() {
    }

    public Funcionario(String nome, NivelFuncionario nivelFuncionario, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivelFuncionario = nivelFuncionario;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelFuncionario getNivelFuncionario() {
        return nivelFuncionario;
    }

    public void setNivelFuncionario(NivelFuncionario nivelFuncionario) {
        this.nivelFuncionario = nivelFuncionario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    //métodos
    public void adicionarContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public double ganhoNoMes(int ano, int mes) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();

        for (ContratoHora contrato : contratos) {
            cal.setTime(contrato.getData());

            int anoContrato = cal.get(Calendar.YEAR);
            int mesContrato = 1 + cal.get(Calendar.MONTH);

            if(ano == anoContrato && mes == mesContrato) {
                soma += contrato.valorTotal();
            }
        }

        return soma;
    }
}
