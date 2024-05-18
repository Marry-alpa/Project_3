package com.example.demo3.part_1_3;

import com.example.demo3.part_1_3.amphib.*;
import com.example.demo3.part_1_3.animals.*;
import com.example.demo3.part_1_3.insects.*;


public class SoundMaker {
    public static void main(String[] args) {
        Animals myAnimal = new Animals();
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Frog myFrog = new Frog();
        Cricket myCricket = new Cricket();
        Bee myBee = new Bee();
        myAnimal.makeSound(); // Some sound
        myDog.makeSound(); // Bark
        myCat.makeSound(); // Meow
        myFrog.makeSound();
        myCricket.makeSound();
        myBee.makeSound();
    }
}

