package pratic10.Animal;

public class OtherAnimal extends Animal{
    private String nameAnimal;

    public OtherAnimal(boolean mammal, String hairColor, String nameAnimal) {
        super(mammal, hairColor);
        this.nameAnimal = nameAnimal;

    }

    @Override
    public String toString() {
        String message =   "Nome do animal: " + nameAnimal + ". Cor do pelo: " + getHairColor() + "." + isMammal() ;
        return message;
    }
}
