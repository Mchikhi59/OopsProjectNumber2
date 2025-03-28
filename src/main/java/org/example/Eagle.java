package org.example;

public class Eagle extends Bird{
    private double visionRange;

    public Eagle(String name, int age, String habitat, double wingspan, boolean canFly, double visionRange) {
        super(name, age, habitat, wingspan, canFly);
        this.visionRange = visionRange;
    }

    @Override
    public void eat() {
        System.out.println(name + " the eagle is tearing into its prey with its sharp beak.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " screeches: Kreeeeeee!");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Species: Eagle");
        System.out.println("Vision range: " + visionRange + " km");
    }

    public void hunt() {
        System.out.println(name + " is scanning the terrain with its " + visionRange + " km vision range.");
    }
}
