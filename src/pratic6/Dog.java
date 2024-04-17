package pratic6;

import javax.sound.midi.Soundbank;

public class Dog extends Animal {

    private String emitSoundDog = "Au, Au!";

    public void shakeAss(){
        System.out.println("O carchorro está abanando o rabo.");
        System.out.println("The animal do " + getEmitSound());
    }

    public String getEmitSoundDog() {
        return emitSoundDog;
    }

    @Override
    public String getEmitSound() {
        return getEmitSoundDog();
    }
}
