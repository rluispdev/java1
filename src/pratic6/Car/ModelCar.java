package pratic6.Car;

public class ModelCar extends Car {

    String fabactory;

    public void setFabactory(String fabactory) {
        this.fabactory = fabactory;
    }

    public void factory(){
        System.out.println("Fábrica: " +  fabactory);
    }

}
