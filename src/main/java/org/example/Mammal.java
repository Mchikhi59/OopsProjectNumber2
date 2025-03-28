package org.example;

abstract class Mammal extends Animal{
    protected boolean hasFur;
    protected int gestationPeriod;

    public Mammal(String name, int age, String habitat, boolean hasFur, int gestationPeriod) {
        super(name, age, habitat);
        this.hasFur = hasFur;
        this.gestationPeriod = gestationPeriod;
    }
    @Override
    public void displayInformation() {
        System.out.println("Type: Mammal");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Habitat: " + habitat);
        System.out.println("Has fur: " + hasFur);
        System.out.println("Gestation period: " + gestationPeriod + " months");
    }
}


