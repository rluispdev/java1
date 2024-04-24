package pratic10;

public class SoccersPlayers {

    private String namePlayer;

    public String getNamePlayers() {
        return namePlayer;
    }



    public SoccersPlayers(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    @Override
    public String toString() {
        return  getNamePlayers();
    }
}
