package pratic7.ConverterCurrency.Calculate;

public class Book implements Calculate{

    @Override
    public double getCalculeFinalPrince(double finalPrice, int discountValue, double tariff) {
       double discount = (finalPrice * discountValue) / 100;
        double bookFinalPrice = finalPrice - discount;
        return bookFinalPrice;
    }
}
