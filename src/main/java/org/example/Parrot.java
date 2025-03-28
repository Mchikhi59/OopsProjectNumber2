package org.example;

public class Parrot extends Bird{
    private String featherColor;
    private boolean canTalk;

    public Parrot(String name, int age, String habitat, double wingspan, boolean canFly, String featherColor, boolean canTalk) {
        super(name, age, habitat, wingspan, canFly);
        this.featherColor = featherColor;
        this.canTalk = canTalk;
    }

    @Override
    public void eat() {
        System.out.println(name + " the parrot is pecking at seeds and nuts.");
    }

    @Override
    public void makeSound() {
        if (canTalk) {
            System.out.println(name + " says: 'Hello there! Polly wants a cracker!'");
        } else {
            System.out.println(name + " squawks: Screeeech!");
        }
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Species: Parrot");
        System.out.println("Feather color: " + featherColor);
        System.out.println("Can talk: " + canTalk);
    }
}

