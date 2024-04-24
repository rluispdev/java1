package pratic10.CalcArea;

public class Square implements Form{
    int l;

    public Square(int l) {
        this.l = l;
    }

    @Override
    public int calcArea() {
        int area = l * l;
        return area;
    }

    @Override
    public String toString() {
        return "A área do Quadrado é: " + calcArea() + " cm²";
    }
}
