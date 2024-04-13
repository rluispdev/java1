package pratic4;

public class Car {
    String model;
    int year;
    String color;

    void dataSheet(){
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + year);
        System.out.println("Cor: " + color);
    }

    int calcAgeCar( int actualYear){
        int result = actualYear - year;
        System.out.println( "Esse carro tem " + result + " anos");
         return  result;

    };
}
