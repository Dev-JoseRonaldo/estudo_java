package AtividadePoo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Digite o titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Deseja fazer um depósito inicial? (y/n)");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.println("Digite o valor inicial de depósito:");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println(conta);
        conta.depositar(200.00);
        System.out.println(conta);
        conta.sacar(198.00);
        System.out.println(conta);




    }
}
