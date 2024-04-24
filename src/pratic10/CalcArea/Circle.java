package pratic10.CalcArea;


public class Circle implements Form{

    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return  Math.PI * raio * raio;

    }
}


