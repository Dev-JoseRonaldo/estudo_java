package POO.exercicioHeranca.entites;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public  void loan(double amount) {
        if (amount <= loanLimit) {
            balance = amount -10.0;
            deposit(amount);
        }
    }

    //sobreposição: usando o metodo da super classe e adicionando novas funcionalidades
    @Override
    //métodos "final" impedem que eles sofram overrides, classes "final" impedem a criação de subclasses delas
    public final void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
