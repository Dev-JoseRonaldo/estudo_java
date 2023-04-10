package POO.exercicioComposicao1;

import POO.exercicioComposicao1.entites.ContratoHora;
import POO.exercicioComposicao1.entites.Departamento;
import POO.exercicioComposicao1.entites.Funcionario;
import POO.exercicioComposicao1.entites.enums.NivelFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Locale;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Digite os dados do funcionário:");
        System.out.print("Nome: ");
        String nomeFuncionario = sc.nextLine();
        System.out.print("Nível: ");
        String nivelFuncionario = sc.nextLine();
        System.out.print("Salário Base: ");
        double salarioBase = sc.nextDouble();
        Funcionario funcionario = new Funcionario(nomeFuncionario, NivelFuncionario.valueOf(nivelFuncionario), salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos o funcionário tem? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Digite os dados do contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contratoData = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duração (hours): ");
            int horas = sc.nextInt();
            ContratoHora contrato = new ContratoHora(contratoData, valorHora, horas);
            funcionario.adicionarContrato(contrato);
        }

        System.out.println();
        System.out.print("Digite o mes e o ano para calcular os ganhos (MM/YYYY): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
        System.out.println("Ganhos no mes " + mesAno + ": " + String.format("%.2f", funcionario.ganhoNoMes(ano, mes)));


        sc.close();
    }
}
