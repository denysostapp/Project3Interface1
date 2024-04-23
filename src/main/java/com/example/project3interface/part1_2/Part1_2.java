package com.example.project3interface.part1_2;

import java.util.ArrayList;

class Superclass {
        void theMethod(){
            System.out.println("Method of SuperClass");

        }
    }
    class Subclass extends Superclass{
        @Override
        void theMethod(){

            super.theMethod();
            System.out.println("Method of SubClass");
        }
    }

    abstract class Animal {
        abstract void makeSound();
    }
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }
    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }
    class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Moo");
        }
    }
    class Pig extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Oink");
        }
    }


    public class Part1_2 {
        public static void main(String[] args) {
            Superclass a = new Subclass();
            a.theMethod();
            ArrayList<Animal> animals = new ArrayList<Animal>();
            animals.add(new Dog());
            animals.add(new Cat());
            animals.add(new Cow());
            animals.add(new Pig());
            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }

