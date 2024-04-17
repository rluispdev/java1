package pratic6;

public class Cat extends Animal {

    private String emitSoundCat = "Miau, Miau!";

    public String getEmitSoundCat() {
        return emitSoundCat;
    }

    public void shakeAssCat(){
        System.out.println("O gato está abanando o rabo.");
        System.out.println("The animal do: " + getEmitSound());
    }

    @Override
    public String getEmitSound() {
        return getEmitSoundCat();

    }
}
