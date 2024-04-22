package pratic7.ConverterCurrency.Marketable;

public class Product implements Marketable{
    @Override
    public double getPrice(int quant, int discount, double price) {
        double originalPrice = quant * price;
        int myDiscount = (int) ((discount * originalPrice) /100);
        double totalPrice = originalPrice  - myDiscount ;

        System.out.println(String.format("Preço: Original de %d livros = R$ %.2f. Um livro é: R$  %.2f. Se você  comprar %d livros  AGORA! Você ganha um desconto de %d%%  e paga apenas R$ %.2f APROVEITE!", quant, originalPrice,  price, quant, discount, totalPrice));
        return totalPrice;
    }
}
