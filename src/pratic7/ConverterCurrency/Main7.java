package pratic7.ConverterCurrency;

import pratic7.ConverterCurrency.CalculatorRectangle.CalculatorRoomRect;
import pratic7.ConverterCurrency.ConveterCurrency.ConverterCurrency;

public class Main7 {
    public static void main(String[] args) {

        ConverterCurrency converter = new ConverterCurrency();
        System.out.printf(String.format("Valor da Conversão %.2f ",converter.getFinanceConverter(90)));

        CalculatorRoomRect calcroom = new CalculatorRoomRect();
        System.out.println("Area do Rectangulo " + calcroom.getCalcArea(8,3));
        System.out.println("perimetro do Rectangulo " +  calcroom.getCalcPerimeter(4,10));




    }
}
