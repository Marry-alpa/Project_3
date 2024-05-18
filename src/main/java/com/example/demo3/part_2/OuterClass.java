package com.example.demo3.part_2;

public class Inners {

    public class OuterClass {
        private String outerField = "Outer field";

        // Inner class
        class InnerClass {
            void display() {
                System.out.println("Inner class accessing: " + outerField);
            }
        }

        void outerMethod() {
            InnerClass inner = new InnerClass();
            inner.display();
        }

        public static void main(String[] args) {
            OuterClass outer = new OuterClass();
            outer.outerMethod();
        }
    }


}
