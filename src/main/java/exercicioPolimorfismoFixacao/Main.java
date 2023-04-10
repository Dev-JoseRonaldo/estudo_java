package exercicioPolimorfismoFixacao;

import exercicioPolimorfismoFixacao.entites.Pessoa;
import exercicioPolimorfismoFixacao.entites.PessoaFisica;
import exercicioPolimorfismoFixacao.entites.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> lista = new ArrayList<>();

        System.out.print("Digite o número de pessoas: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa #" + (i + 1) + " data:");
            System.out.print("Pessoa física ou Pessoa jurídica? (f/j)");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if( ch == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();
                lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }
            else {
                System.out.print("Número de funcionários: ");
                Integer numeroFuncionarios = sc.nextInt();
                lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }

        double sum = 0.0;
        System.out.println("\nTaxas a pagar:");
        for (Pessoa pessoa : lista) {
            double taxa = pessoa.taxa();
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", taxa));
            sum += taxa;
        }

        System.out.println();
        System.out.println("Total de taxas: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
