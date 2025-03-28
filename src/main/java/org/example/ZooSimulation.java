package org.example;

public class ZooSimulation {
    public static void main(String[] args) {

        Animal lion =new Lion("leo",15,"africa",true,4,180);
        lion.eat();
        lion.makeSound();;
        lion.sleep();
        lion.displayInformation();
        System.out.println();

        Animal elephant =new Elephant("zaza",25,"africa",true,22,180);
        elephant.eat();
        elephant.makeSound();;
        elephant.sleep();
        elephant.displayInformation();
        System.out.println();

        Animal parrot= new Parrot("kavin",3,"brazil",50.0,true,"Rainbow",true);
        parrot.eat();
        parrot.makeSound();;
        parrot.sleep();
        parrot.displayInformation();
        System.out.println();

        Animal eagle= new Eagle("sally",5,"USA",220,true,3.2);
        eagle.eat();
        eagle.makeSound();;
        eagle.sleep();
        eagle.displayInformation();
        System.out.println();
        Registration register=new Registration();
        register.setEmail("userEmail@yahoo.com");
        register.setUserName("ZooEco22");
        register.setPassword("PassCode2025");
        register.displayRegistration();

    }
}
