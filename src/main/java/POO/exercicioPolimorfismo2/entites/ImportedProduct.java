package POO.exercicioPolimorfismo2.entites;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPRice() {
    return getPrice() + customsFee;
    }

    @Override
    public final String priceTag() {
            return super.priceTag() + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";

    }
}
