package com.example.demo3.part_1;

class Superclass{
    void theMethod(){
        System.out.println("Superclass method");
    }
}

class Subclass extends Superclass{
    @Override
    void theMethod(){
        System.out.println("Subclass method");
    }
}

public class Polymorph {
    public static void main(String[] args) {
        Superclass a = new Subclass();
        a.theMethod();
        //the subclass method will be called because polymorphism allows the subclass to override the superclass method
    }
}
