package pratic7.ConverterCurrency.TemperatureConvert;

public class DefautTemperatureConvert implements TemperatureConvert{

    @Override
    public double getCelsiusToFahrenheit(int celsius) {
        double f = (celsius * 9/5) + 32;
        return f;
    }

    @Override
    public int getFahrenheitToCelsius(double fahrenheit) {
        int c = (int) ((fahrenheit - 32) * 5/9);
        return c;
    }
}
