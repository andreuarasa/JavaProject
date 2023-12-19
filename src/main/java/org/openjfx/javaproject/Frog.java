package org.openjfx.javaproject;

public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";

    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        updateFrogletStatus();
    }

    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int) (ageInYears * 12), tongueSpeed);
    }

    public Frog(String name) {
        this(name, 5, 5.0);
    }

    private void updateFrogletStatus() {
        isFroglet = age > 1 && age < 7;
    }

    public void grow(int months) {
        age += months;
        if (age < 12) {
            tongueSpeed += months;
        } else if (age >= 30) {
            tongueSpeed -= months;
            if (tongueSpeed < 5) {
                tongueSpeed = 5;
            }
        }
        updateFrogletStatus();
    }

    public void grow() {
        grow(1);
    }

    public void eat(Fly fly) {
        if (fly.isDead()) {
            return;
        }

        if (tongueSpeed > fly.getSpeed()) {
            grow();
            fly.setMass(0);
        } else {
            fly.grow(1);
        }
    }

    public String toString() {
        if (isFroglet) {
            return String.format("My name is %s and I'm a rare froglet! I'm %d months old and my tongue has a speed of %.2f.",
                    name, age, tongueSpeed);
        } else {
            return String.format("My name is %s and I'm a rare frog. I'm %d months old and my tongue has a speed of %.2f.",
                    name, age, tongueSpeed);
        }
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String newSpecies) {
        species = newSpecies;
    }
}


