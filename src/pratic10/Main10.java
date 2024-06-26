package pratic10;

import pratic10.Animal.Animal;
import pratic10.Animal.Dog;
import pratic10.Animal.OtherAnimal;
import pratic10.Bank.MyBanck;
import pratic10.CalcArea.Circle;
import pratic10.CalcArea.Form;
import pratic10.CalcArea.Square;
import pratic10.Product.Product;

import java.util.ArrayList;

public class Main10 {
    public static void main(String[] args) {

        var soccerPlayer1 = new SoccersPlayers("Neymar");
        var soccerPlayer2 = new SoccersPlayers("Gabi Gol");
        var soccerPlayer3 = new SoccersPlayers("Pedro");

        ArrayList<SoccersPlayers> soccers = new  ArrayList<>();
        soccers.add(soccerPlayer1);
        soccers.add(soccerPlayer2);
        soccers.add(soccerPlayer3);

        for (SoccersPlayers item : soccers){
            System.out.println("The top Player: " + item);
        }

        var dog = new Dog("Lulu" , true, true, "Marrom");
        var dog1 = new Dog("Bilu", true, true, "Amarelo" );
        var dog2 = new Dog("Totó", false , true, "Preto");
        var dog3 = new Dog("Azulão",true , true, "Branco");

        dog.setFavoriteToy("Bola.");
        dog1.setFavoriteToy("Ossinho de plástico.");
        dog2.setFavoriteToy("Usinho Ted.");
        dog3.setFavoriteToy("Garrafa pet.");

         var otherAnimal = new OtherAnimal(true,"Marron","Castor");
         var otherAnimal2 = new OtherAnimal(false, "Branco", "Pelicano");

        ArrayList<Animal>  animals = new ArrayList<>();
        animals.add(dog);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(dog1);
        animals.add(otherAnimal);
        animals.add(otherAnimal2);

        for(Animal item: animals){
            System.out.println(item);
            if (item instanceof Dog toy )
            System.out.println(toy.getFavoriteToy());
        }

        var product = new Product("Celular", 800);
        var product2 = new Product("Videogame", 2500);
        var product3 = new Product("Tablet", 467);
        var product4 = new Product("Pendrive", 34);
        var product5 = new Product("WebCam Full HD", 239);

        ArrayList<Product>  products = new ArrayList<>();

        products.add(product);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        int totalPrice = 0;
        for ( Product item: products){

            if (item.getPrice() > 0){
                totalPrice += item.getPrice();
            }
            System.out.println(item);

        }
        int mediaPrice = totalPrice / 5;
        System.out.println("O preço medio dos produtos é: R$ " + mediaPrice + " reais.");

       Circle circle = new Circle();
       circle.setRaio(5);

        var square = new Square();
        square.setL(7);

        ArrayList<Form> forms = new ArrayList();
        forms.add(circle);
        forms.add(square);

        for (Form item: forms){

            System.out.println("Area " + item.calcArea());
        }

        var myBanckLeo = new MyBanck();
        myBanckLeo.setAccount(789012);
        myBanckLeo.setBalance(458000);

        var myBanckVictor = new MyBanck();
        myBanckVictor.setAccount(4509002);
        myBanckVictor.setBalance(423999);

        var myBanckLeila = new MyBanck();
        myBanckLeila.setAccount(3440003);
        myBanckLeila.setBalance(1200000);

        ArrayList<MyBanck> bank = new ArrayList<MyBanck>();
        bank.add(myBanckLeo);
        bank.add(myBanckLeila);
        bank.add(myBanckVictor);

        int mostValue = 0;

        for(MyBanck item : bank){
            if (item.getBalance() > mostValue){
                mostValue = item.getAccount();
            }
        }
        System.out.println(" A maior conta é Conta: "  + mostValue);
    }
}
