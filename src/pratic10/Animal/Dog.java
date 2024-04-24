package pratic10.Animal;

public class Dog  extends  Animal {
    private boolean toBark;
    private String name;


    public Dog(String name, boolean toBark,boolean mammal, String hairColor) {
        super(mammal, hairColor);
        this.toBark = toBark;
        this.name = name;
    }



    @Override
    public String toString() {
        String nameDog = "Nome do Cachorro: " + name + "." + " Cor do pelo: " + getHairColor() + ". " + isMammal() ;
        String message;

        if (toBark == true) {
            message = nameDog + " Ele lati muito.";
        } else {
           message = nameDog + "Esse cachorro teve um problema nas cordas vocais.";
        }

        return message;
    }
}