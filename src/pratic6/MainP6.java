package pratic6;

public class MainP6 {

    public static void main(String[] args) {
        ModelCar modelCar = new ModelCar();
        modelCar.setFabactory("Volks");
        modelCar.factory();
        modelCar.setModel("Fusca");
        modelCar.setPriceYear1(3400.45);
        modelCar.setPriceYear2(5900.90);
        modelCar.setPriceYear3(2800.20);
        modelCar.calcMedia(3);
        modelCar.showInformation();
        System.out.println("-----------------------------");
        ModelCar modelCar2 = new ModelCar();
        modelCar2.setFabactory("Fiat");
        modelCar2.factory();
        modelCar2.setModel("Elba");
        modelCar2.setPriceYear1(3900.15);
        modelCar2.setPriceYear2(4900.72);
        modelCar2.setPriceYear3(6800.25);
        modelCar2.calcMedia(3);
        modelCar2.showInformation();
    }
}


