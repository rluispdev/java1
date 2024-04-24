package pratic10.Animal;

public class Animal {
    private String  favoriteToy;

    public Animal(boolean mammal, String hairColor) {
        this.mammal = mammal;
        this.hairColor = hairColor;
    }

    private boolean mammal;
    private String hairColor;

    public String isMammal(){
      String message;

        if (mammal == true){
         message = " Esse animal é mamífero. ";
        }else{
            message = " Esse animal NÃO é mamífero. ";
        }
        return message;
    }

    public String getHairColor() {
        return  hairColor;
    }

    public String getFavoriteToy() {
        String message = "O brinquedo favorito dele é: "  + favoriteToy;
        return message;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

}
