package org.example;

abstract class Animal implements AnimalBehavior{

        protected String name;
        protected int age;
        protected String habitat;

        public Animal(String name, int age, String habitat) {
            this.name = name;
            this.age = age;
            this.habitat = habitat;
        }

        @Override
        public void sleep() {
            System.out.println(name + " is sleeping peacefully.");
        }

        public abstract void displayInformation();
    }

