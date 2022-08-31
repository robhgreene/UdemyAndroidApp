package com.example.learningjava;

public class MyClass {
    public static void main(String[] args) {
        // this is single-line comment
        /*
        This is
        a multi-line
        comment
         */

        /*
        System.out.println("Hello there!");
        System.out.println("I'm a dog.");
        */

        // strings
        String name = "Robert Greene";

        //ints
        // int age = 13;
        /*
        // printing pring line
        // sout <enter> is the shortcut for print function
        // useful tool for debugging
        System.out.println(name);
        System.out.println(age);
        System.out.println(45);

        String hello = "Hi, my name is Rob and I like cheese.";
        System.out.println(hello);
        */

        // variables
        // variables can be changed throughout the program
        // once a variable has been declared, only data of the same type can be used for that variable
        /*
        String dog = "Rex";
        System.out.println(dog);
        dog = "Fred";
        System.out.println(dog);

        int dogAge = 10;
        System.out.println(dogAge);
        dogAge = 15;
        System.out.println(dogAge);

        int moneyInMyWallet = 0;
        moneyInMyWallet = 100;
        moneyInMyWallet = 92;
        System.out.println(moneyInMyWallet);
        */

        // Booleans
        boolean iAmCool = true;
        boolean iAmNotCool = false;

        // If Statements
        /*
        int age = 17;
        if (iAmNotCool) {
            System.out.println("It was true!");
            // concatiniting strings and ints
            System.out.println("the age is " + age);
        } else {
            System.out.println("It is FALSE!");

        }

        if (age > 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are a minor.");
        }

        if (age == 18) {
            System.out.println("You are 18");
        } else {
            System.out.println("You are not 18.");
        }

        if (age != 18) {
            System.out.println("You are not 18");
        } else {
            System.out.println("You're 18, yo.");
        }
        */
        /*
        // 1. Make a boolean variable that is equal to false
        // 2. Make an if statement that prints hello, if the above boolean is turn
        // 3. Make an int variable and use it in an if statement
        // 4. (optional) make an if statement to see if two strings are equal to each other

        boolean someBool = false;
        int someNum = 12;

        if (someBool) {
            System.out.println("Hello!");
        }

        if (someNum > 14) {
            System.out.println("You number is either 14 or less");
        } else {
            System.out.println("Your numbere is greater than 14!");
        }

        String myString = "My String.";
        String alsoMyString = "My String.";

        if (myString == alsoMyString) {
            System.out.println("The strings match!");
        } else {
            System.out.println("The strings do not match.");
        }

         */
        /*
        // Arrays
        // arrays can only be one data type
        String[] dogNames = new String[]{"Fido", "Rex", "Charles", "Dingus"};
        System.out.println(dogNames[1]);

        int[] ages = new int[]{0, 1, 2, 3, 4};
        System.out.println(ages[1]);

        boolean[] myBools = new boolean[]{true, false, false, true};
        System.out.println(myBools[3]);
        // .length will print the number of items in an array
        System.out.println(myBools.length);
        // this will print out the last item in an array
        System.out.println(myBools[myBools.length-1]);

        // 1. Make an array of Doubles

        // 2. Make an array of ints, and then create an if statement that prints "Big"
        // if the array is longer than 10 ints.

        double myDoubles[] = new double[]{1.2346, 3.29478, 3.2736, 9.2764};

        int moreInts[] = new int []{2, 5, 3958, 8372, 9572, 59250, 2811, 9372};

        if (moreInts.length > 10) {
            System.out.println("Big!");
        } else {
            System.out.println("Not big.");
        }

         */
    }
}