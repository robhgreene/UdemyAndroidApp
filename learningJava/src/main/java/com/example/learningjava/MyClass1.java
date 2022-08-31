package com.example.learningjava;

public class MyClass1 {

    public static void main(String[] args) {

        // loops
        // this will run the block of code 10 times
        // how the loops works, looks at the initial count, does the comparison,
        // if the comparison is true, it runs the code. It then modifies the count
        // based on the third piece.
        /*
        for (int i=0; i < 10; i++) {
            // will print out 0-9 for i (10 times)
            System.out.println("Rock on!" + i);
        }
        // i is within the scope of each of these loops
        for (int i=0; i > -10; i = i -2) {
            // will print out 0 to -8 in increments of 2
            System.out.println("Rock on!" + i);
        }

        for (int i=0; i == 0; i = i -2) {
            // will print out 0-9 for i (10 times)
            System.out.println("Rock on!" + i);
        }

        // looping through an array

        String[] catNames = new String[]{"Felix", "Max", "Dinky", "Bigglesworth"};
        for (int i=0; i < catNames.length; i++) {
            System.out.println(catNames[i]);
        }
        */
        // 1. Make a loop that prints something 50 times

        // 2. Make an array of ints and loops through each item in the array to add all the ints
        // together and print out that number
        /*
        for (int i=0; i<50; i++) {
            System.out.println("Look at this!" + i);
        }
        */
        int numArray[] = new int[]{1, 23, 53, 7, 89, 234, 2, 67, 1, 0, 89};

        int total = 0;
        for (int i=0; i<numArray.length; i++) {
            total += numArray[i];
            System.out.println(total);
        }
    }
}
