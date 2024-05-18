package com.example.demo3.part_2;

public class OuterClassWithLocal {
    void someMethod() {
        final String localVariable = "Local variable";

        // Local class
        class LocalClass {
            void display() {
                System.out.println("Local class accessing: " + localVariable);
            }
        }

        LocalClass local = new LocalClass();
        local.display();
    }

    public static void main(String[] args) {
        OuterClassWithLocal outer = new OuterClassWithLocal();
        outer.someMethod();
    }
}

