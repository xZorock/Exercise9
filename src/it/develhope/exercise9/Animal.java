package it.develhope.exercise9;

public class Animal {

    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void animalSound() {
        System.out.println("Roarr!!");
    }

    public void animalSound(String intensity) {
        if (intensity == "high"){
            System.out.println("Roarrrrrrrr");
        } else if (intensity == "low"){
            System.out.println("Roar");
        } else System.out.println("Cannot reproduce it properly");
    }
}