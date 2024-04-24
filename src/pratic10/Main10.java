package pratic10;

import pratic10.Animal.Animal;
import pratic10.Animal.Dog;
import pratic10.Animal.OtherAnimal;

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
            Dog toy = (Dog) item;
            System.out.println(toy.getFavoriteToy());
        }
    }
}
