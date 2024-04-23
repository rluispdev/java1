package pratic9.Product;

public class PerishableProduct extends Product {

    public String date (int day, int month, int year){
        return "Data de validade " + day + "/" + month + "/" + year;
    }

    public PerishableProduct(String name, double prince, int quant) {
        super(name, prince, quant );
    }

}


