package oop;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        dog1.setChildFriendlyAnimal("Dog");
        dog1.setName("Stela");
        dog1.setAge(2.2F);
        dog1.setBreed("Husky");
        dog1.setHigh(53.2F);

        cat1.setChildFriendlyAnimal("Cat");
        cat1.setName("Mairi");
        cat1.setAge(1.5F);
        cat1.setBreed("Scotish Folder");
        cat1.setColour("Blue");

        System.out.printf("Child friendly animal is: %s, name is: %s, age is: %.2f, breed is: %s, high is: %.2f \n",
                dog1.getChildFriendlyAnimal(), dog1.getName(), dog1.getAge(), dog1.getBreed(), dog1.getHigh());
        System.out.printf("Child friendly animal is: %s, name is: %s, age is: %.2f, breed is: %s, colour is: %s \n",
                cat1.getChildFriendlyAnimal(), cat1.getName(), cat1.getAge(), cat1.getBreed(), cat1.getColour());

    }
}
