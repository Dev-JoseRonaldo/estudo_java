package exercicioheranca;

import exercicioheranca.entites.Account;
import exercicioheranca.entites.BusinessAccount;
import exercicioheranca.entites.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


        // output para entender classe abstrata
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1010,"Alan", 500.00, 0.01));
        list.add(new SavingsAccount(1011,"Mario", 1000.00,  400.0));
        list.add(new SavingsAccount(1012,"Julia", 300.00, 0.01));
        list.add(new SavingsAccount(1013,"Menezes", 500.00, 500.0));

        double sum = 0;

        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total Balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }


    }
}
