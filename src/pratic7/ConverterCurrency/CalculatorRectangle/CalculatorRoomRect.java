package pratic7.ConverterCurrency.CalculatorRectangle;

public class CalculatorRoomRect implements CalcGeometry {

    @Override
    public int getCalcArea(int b, int a) {
        int area = b * a;
        return area;
    }

    @Override
    public int getCalcPerimeter(int l1, int l2) {
        int perimeter = 2 * (l1 + l2);
        return perimeter;
    }
}
