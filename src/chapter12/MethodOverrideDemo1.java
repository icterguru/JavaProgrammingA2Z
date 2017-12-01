package chapter12;
// MethodOverrideDemo1.java
/* In this example Pet variable behaves polymorphic because it can be either Cat or Dog.  The method makeSound() overridden in sub class Dog and Cat. */

import java.util.ArrayList;
import java.util.List;

abstract class Pet{
    public abstract void makeSound();
}

class Cat extends Pet{

    @Override
    public void makeSound() {
        System.out.println("Cat makes Meow sound");
    }
}

class Dog extends Pet{

    @Override
    public void makeSound() {
        System.out.println("Dog makes Woof sound");
    }

}


public class MethodOverrideDemo1{

    public static void main(String args[]) {
        //Now Pet will show How Method Overriding works in Java
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Cat());
        pets.add(new Dog());

        //pet variable which is type of Pet behave different based
        //upon whether pet is Cat or Dog
        for(Pet pet : pets){
            pet.makeSound();
        }

    }
}
