package pratic7.ConverterCurrency.Calculate;

public class PhysicalProduct implements Calculate{

    @Override
    public double getCalculeFinalPrince(double finalPrice, int discountValue, double tariff) {
        double discount = (finalPrice * discountValue) / 100;
        double physicalProduct = finalPrice + tariff - discount;
        return physicalProduct;
    }
}
