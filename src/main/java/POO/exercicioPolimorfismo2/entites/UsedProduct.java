package POO.exercicioPolimorfismo2.entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private SimpleDateFormat manufactureDate;

    public UsedProduct(String name, double price, SimpleDateFormat manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public SimpleDateFormat getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(SimpleDateFormat manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag() {
        return  name + "(used) $ " + String.format("%.2f", price) + " (Manufacture date: " + this.manufactureDate.format(new Date()) + ")";
    }
}
