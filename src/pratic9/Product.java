package pratic9;

public class Product {
    private String name;
    private double prince;
    private  int quant;

    public Product(String name, double prince, int quant) {
        this.name = name;
        this.prince = prince;
        this.quant = quant;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nome do produto: " + this.getName();
    }
}
