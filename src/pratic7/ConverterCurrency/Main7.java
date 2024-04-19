package pratic7.ConverterCurrency;

import pratic7.ConverterCurrency.BookTable.BookTable;
import pratic7.ConverterCurrency.Calculate.Book;
import pratic7.ConverterCurrency.Calculate.PhysicalProduct;
import pratic7.ConverterCurrency.CalculatorRectangle.CalculatorRoomRect;
import pratic7.ConverterCurrency.ConveterCurrency.ConverterCurrency;
import pratic7.ConverterCurrency.TemperatureConvert.DefautTemperatureConvert;
import pratic7.ConverterCurrency.TemperatureConvert.TemperatureConvert;

public class Main7 {
    public static void main(String[] args) {

        ConverterCurrency converter = new ConverterCurrency();
        System.out.printf(String.format("Valor da Conversão %.2f ", converter.getFinanceConverter(90)));

        CalculatorRoomRect calcroom = new CalculatorRoomRect();
        System.out.println("Area do Rectangulo " + calcroom.getCalcArea(8, 3));
        System.out.println("perimetro do Rectangulo " + calcroom.getCalcPerimeter(4, 10));


        BookTable table = new BookTable();
        String myTable = table.getShowTable((int) 5.0);
        System.out.println(myTable);

        DefautTemperatureConvert temperatureConvert = new DefautTemperatureConvert();
        double t = temperatureConvert.getFahrenheitToCelsius(124);
        System.out.println(String.format("Temperatura Convertida de Fahrenheit para Celsius: %.0fº", t));

        double t2 = temperatureConvert.getCelsiusToFahrenheit(3);
        System.out.println(String.format("Temperatura Convertida de Celsius para  Fahrenheit: %.0fº ", t2));

        Book book = new Book();
        double finalPrice = book.getCalculeFinalPrince(45.90, 15, 0);
        System.out.println(String.format( "O preço final é R$ %.2f", finalPrice));

        PhysicalProduct physicalProduct = new PhysicalProduct();
        double product = physicalProduct.getCalculeFinalPrince(56.90, 50, 18);
        System.out.println(String.format( "O preço final é R$ %.2f", product));

    }
}





