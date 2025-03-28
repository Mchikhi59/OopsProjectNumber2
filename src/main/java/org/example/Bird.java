package org.example;

abstract class Bird extends Animal {
    protected double wingspan;
    protected boolean canFly;

    public Bird(String name, int age, String habitat, double wingspan, boolean canFly) {
        super(name, age, habitat);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    @Override
    public void displayInformation() {
        System.out.println("Type: Bird");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Habitat: " + habitat);
        System.out.println("Wingspan: " + wingspan + " cm");
        System.out.println("Can fly: " + canFly);
    }

    public void fly() {
        if (canFly) {
            System.out.println(name + " is flying!");
        } else {
            System.out.println(name + " cannot fly.");
        }
    }
}


