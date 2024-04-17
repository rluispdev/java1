package pratic6.Car;

public class Car {

    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPriceYear1(double priceYear1) {
        this.priceYear1 = priceYear1;
    }

    public void setPriceYear2(double priceYear2) {
        this.priceYear2 = priceYear2;
    }

    public void setPriceYear3(double priceYear3) {
        this.priceYear3 = priceYear3;
    }

    public void showInformation() {
        System.out.println(String.format(" O preço do carro em 2024 é de R$ %.2f ." , priceYear1));
        System.out.println(String.format(" O preço do carro em 2025 é de R$ %.2f ." , priceYear2));
        System.out.println(String.format(" O preço do carro em 2026 é de R$ %.2f ." , priceYear3));
        System.out.println(String.format("A media em 03 anos será R$ %.2f . " , calcMedia(3)));
        System.out.println(String.format("O maior preço foi R$ %.2f" , calcHigherPrice()));
        System.out.println(String.format("O menor preço foi R$ %.2f" , calcLowestPrice()));
    };

    public double calcMedia(int mediaPrice){
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








