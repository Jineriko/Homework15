package com.company.project.homework.lesson13;

public class Main {
    public static void main(String[] args) {
        Action action01 = new Eat();
        Action action02 = new Drink();
        Action action03 = new Play();

//        action01.execute(); // eat
//        action02.execute(); // drink
//        action03.execute(); // play

//        action01.nextAction(action02);
//        action02.nextAction(action03);

        Animal animal = new Animal();
        animal.doAction(action01); // eat drink play
        System.out.println();
        animal.doAction(action02); // drink play
        System.out.println();
        animal.doAction(action03); // play
    }
}