package com.example.learningjava;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

public class MyClass2 {

    // defining a function
    public static void hello() {
        System.out.println("Hello, there!");
    }

    public static void sayHelloToTheDog(String dogName) {
        System.out.println("Hello there " + dogName + "!");
    }

    public static void addTwoNumbers(int number1, int number2, String words) {
        System.out.println(words + number1 + number2);
    }

    public static int addThese(int number1, int number2) {
        return number1 + number2;
    }

    // 1. Make a function that prints your favorite song title
    // 2. Make a function that take a fist and last name as a parameter, and print out the full name
    // 3. Make the above function, return the full name instead of printing it

    public static void favoriteSongTitle(String songTitle) {
        System.out.println("Your favorite song is " + songTitle + ".");
    }

    public static void nameCombiner(String firstName, String lastName) {
        System.out.println("Your name is " + firstName + " " + lastName);
    }

    public static String combineName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {

        // Functions
        // calling a function
        hello();

        sayHelloToTheDog("Fido");
        sayHelloToTheDog("Dingus");

        addTwoNumbers(23,25,"Some words");

        int result = addThese(12,15);
        System.out.println(result);

        favoriteSongTitle("The Chain");

        nameCombiner("Robert", "Greene");

        System.out.println(combineName("Robert", "Greene"));

    }
}
