package model.logic;

import animals.Animals;

import java.util.List;

public class AnimalVoice {
    public static void getAnimalVoice(List<? extends Animals> animals, String name) {
        for(Animals animal:animals){
            if (animal.getName().equals(name)){
                animal.shout();
                break;
            }
        }
    }
}
