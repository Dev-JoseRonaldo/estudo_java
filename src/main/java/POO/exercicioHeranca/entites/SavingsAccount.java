package POO.exercicioHeranca.entites;

public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    //sobreposição: reescrevendo o método
    @Override
    //métodos "final" impedem que eles sofram overrides, classes "final" impedem a criação de subclasses delas
    public final void withdraw(double amount) {
        balance -= amount;
    }
}