package pratic10.CalcArea;

public class Square implements Form{
    private int l;

    public void setL(int l) {
        this.l = l;
    }

    @Override
    public double calcArea() {
      return l * l;
    }
}

