package pratic10;

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
    }
}
