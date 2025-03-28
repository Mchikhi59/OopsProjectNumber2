package org.example;

public class Lion extends Mammal{
    private double lenght;

    public Lion(String name, int age, String habitat, boolean hasFur, int gestationPeriod, double lenght) {
        super(name, age, habitat, hasFur, gestationPeriod);
        this.lenght = lenght;
    }

    @Override
    public void eat() {
        System.out.println(name + " the lion is hunting and eating fresh meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars: Rooooooar!");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Species: Lion");
        System.out.println("lenght size: " + lenght + " cm");
    }
}
