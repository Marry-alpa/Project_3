package com.example.demo3.part_2;

    public class AnonymousClass {

        interface Greeting {
            void greet();
        }

        void createAnonymousClass() {
            // Anonymous class implementing the Greeting interface
            Greeting greeting = new Greeting() {
                @Override
                public void greet() {
                    System.out.println("Hello from anonymous class!");
                }
            };

            greeting.greet();
        }

        public static void main(String[] args) {
            AnonymousClass demo = new AnonymousClass();
            demo.createAnonymousClass();
        }
    }

