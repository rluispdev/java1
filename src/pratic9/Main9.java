package pratic9;

import java.util.ArrayList;

public class Main9 {
    public static void main(String[] args) {

        var product = new Product("Suco de Maracujá", 2.50, 3);
        var product2 = new  Product("Suco de Melancia", 2.98, 1);
        var product3 = new  Product("Suco de Abacaxi", 1.60,15);
        var product4 = new Product("Suco de Amora", 3.90,3);
        var product5 = new Product("Suco de Framboesa", 7.39,25);


        ArrayList<Product>  listProduct =  new ArrayList<>();
        listProduct.add(product);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);

        System.out.println("Tamanho da Lista: " + listProduct.size());
        System.out.println("Item: " + listProduct.get(3));


    }
}
