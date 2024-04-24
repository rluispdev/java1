package pratic10.CalcArea;

public class Circle implements Form{

    int r;
    double pi = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    public double cicleCircunference(){
        double area = pi * ( calcArea() * calcArea());
        return  area;
    }

    @Override
    public int calcArea() {
      int raio =  (r * r);
        return  raio;
    }


    @Override
    public String toString() {
        return  "O raio do Círculo é  "  + r + " r² e: " + calcArea() + ". Logo, a área desse círculo é: " + cicleCircunference();
    }
}
