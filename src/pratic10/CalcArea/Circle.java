package pratic10.CalcArea;

public class Circle implements Form{

    int r;


    public Circle(int r) {
        this.r = r;
    }

    public double cicleCircunference(){
        double area = Math.PI * ( r * r);
        return  area;
    }

    @Override
    public int calcArea() {
      int raio =  (r * r);
        return  raio;
    }


    @Override
    public String toString() {
        return  "O raio do Círculo é : "  + r + " Logo r² é: " + calcArea() + ". A área desse círculo é: " + cicleCircunference();
    }
}
