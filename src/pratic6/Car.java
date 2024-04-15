package pratic6;

public class Car {

    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public Car(String model) {
        this.model = model;
    }
    public Car(double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }
    public void showInformation() {
        System.out.println(" O preço do carro em 2024 é de R$ %.2f ." + priceYear1);
        System.out.println(" O preço do carro em 2025 é de R$ %.2f ." + priceYear2);
        System.out.println(" O preço do carro em 2025 é de R$ %.2f ." + priceYear3);
        System.out.println("A media em 03 anos será R$ %.2f . " + calcMedia(3));
        System.out.println("O maior preço foi R$ %.2f" + calcHigherPrice());
        System.out.println("O menor preço foi R$ %.2f" + calcLowestPrice());
    };

    double calcMedia(int mediaPrice){
        return (priceYear1 + priceYear2 + priceYear3) / mediaPrice;
    }
    private double calcHigherPrice(){
        double higherPrice = priceYear1;

        if (priceYear2 > higherPrice){
            higherPrice = priceYear2;
        }

        if (priceYear3 > higherPrice){
            higherPrice = priceYear3;
        }

        return higherPrice;
    }

    private double calcLowestPrice(){
        double lowestPrice = priceYear1;
                if (priceYear2 < lowestPrice){
                    lowestPrice = priceYear2;
                }

                if(priceYear3 < lowestPrice){
                    lowestPrice = priceYear3;
                }
        return lowestPrice;

    }

     };







