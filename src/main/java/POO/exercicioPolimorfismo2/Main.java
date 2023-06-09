package POO.exercicioPolimorfismo2;

import POO.exercicioPolimorfismo2.entites.ImportedProduct;
import POO.exercicioPolimorfismo2.entites.Product;
import POO.exercicioPolimorfismo2.entites.UsedProduct;

import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) {
        Product produto1 = new ImportedProduct("Tablet", 280.00, 20.00);
        Product produto2 = new Product("Notebook", 1100.00);
        Product produto3 = new UsedProduct("Iphone", 400.00, new SimpleDateFormat("15/03/2017"));


        System.out.println("PRICES TAGS:");
        System.out.println(produto1.priceTag());
        System.out.println(produto2.priceTag());
        System.out.println(produto3.priceTag());



    }
}
