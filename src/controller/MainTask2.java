package controller;
/*
Очень костыльно!
Как сделать так, чтобы создавался конкретный объект по имени?
Switch?? Зачем тогда generic?
 */

import animals.*;
import model.logic.AnimalVoice;
import utilities.Input;

import java.util.ArrayList;
import java.util.List;

public class MainTask2 {
    public static void main(String[] args){
        String name= Input.enterString("Enter the name of animal: ");
        List<Animals> animals=new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Snake());
        animals.add(new Cock());
        animals.add(new Cow());
        //animals.getAnimalVoice(animals, name);
    }
}
