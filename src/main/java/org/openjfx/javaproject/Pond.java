package org.openjfx.javaproject;

public class Pond {
    public static void main(String[] args) {
        // Create Frog objects
        Frog peepo = new Frog("Peepo");
        Frog pepe = new Frog("Pepe", 10, 15.0);
        Frog peepaw = new Frog("Peepaw", 4.6 * 12, 5.0);
        Frog yourFrog = new Frog("YourFrog"); // Create your own Frog

        // Create Fly objects
        Fly fly1 = new Fly(1, 3);
        Fly fly2 = new Fly(6);
        Fly yourFly = new Fly(); // Create your own Fly

        // Set the species of any Frog to "1331 Frogs"
        Frog.setSpecies("1331 Frogs");

        // Print out the description of the Frog named Peepo
        System.out.println(peepo.toString());

        // Have the Frog named Peepo attempt to eat the Fly with a mass of 6
        peepo.eat(fly2);

        // Print out the description of the Fly with a mass of 6
        System.out.println(fly2.toString());

        // Have the Frog named Peepo grow by 8 months
        peepo.grow(8);

        // Have the Frog named Peepo attempt to eat the Fly with a mass of 6
        peepo.eat(fly2);

        // Print out the description of the Fly with a mass of 6
        System.out.println(fly2.toString());

        // Print out the description of the Frog named Peepo
        System.out.println(peepo.toString());

        // Print out the description of your own Frog
        System.out.println(yourFrog.toString());

        // Have the Frog named Peepaw grow by 4 months
        peepaw.grow(4);

        // Print out the description of the Frog named Peepaw
        System.out.println(peepaw.toString());

        // Print out the description of the Frog named Pepe
        System.out.println(pepe.toString());
    }
}


