package pratic10.Product;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "Nome do produto: " + name + ", preço do produto R$ " + getPrice();
    }
}
