package pratic7.ConverterCurrency.ConveterCurrency;

public class ConverterCurrency implements FinanceConverter {
    private double real;
    private double dolar = 5.23;

    @Override
    public double getFinanceConverter(int i) {
        double result = i * dolar;
        return result;
    }
}
