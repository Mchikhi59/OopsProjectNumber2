package org.example;

public class Elephant extends Mammal{

    private double trunkLength;

    public Elephant(String name, int age, String habitat, boolean hasFur, int gestationPeriod, double trunkLength) {
        super(name, age, habitat, hasFur, gestationPeriod);
        this.trunkLength = trunkLength;
    }

    @Override
    public void eat() {
        System.out.println(name + " the elephant is using its trunk to eat leaves and fruits.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " trumpets: Pawooooo!");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Species: Elephant");
        System.out.println("Trunk length: " + trunkLength + " cm");
    }

    public void sprayWater() {
        System.out.println(name + " is spraying water with its trunk!");
    }
}
