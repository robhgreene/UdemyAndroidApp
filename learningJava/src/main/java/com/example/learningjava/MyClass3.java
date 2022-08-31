package com.example.learningjava;

public class MyClass3 {

    public static void main(String[] args) {

        // Classes
        // Classes are instantiated as objects
        Dog myPup = new Dog();
        // if this is called on the object, it will use the default values

        myPup.tellAboutDog();
        myPup.name = "Fido";
        myPup.age = 8;
        myPup.furColor = "Brown";

        myPup.tellAboutDog();

        Poodle myDog = new Poodle();

        myDog.curlyFactor = 2.46;

        Bottle myBottle = new Bottle();
        myBottle.size = "large";
        myBottle.color = "black";
        myBottle.ouncesOfFluid = 2.4;
        myBottle.aboutThisBottle();
    }
}
// defining a class
// Classes start with an uppercase
class Dog {

    String name = "Sparky";
    int age = 100;
    String furColor = "Black";

    void tellAboutDog() {
        System.out.println("The dog's name is " + name + ", it is " + age + " years old.");
    }
}
// this class will inherit from Dog
class Poodle extends Dog {
    double curlyFactor = 0.0;
}

// 1. Make a class from something in the room
// 2. Make properties for that class
// 3. Make a function for that class that uses the properties

class Bottle {
    String size = "";
    double ouncesOfFluid = 0.0;
    String color = "";

    void aboutThisBottle() {
        System.out.println("This bottle is " + size + ", " + color + ".");
        System.out.println("This bottle has " + ouncesOfFluid + " of fluid.");
    }
}
