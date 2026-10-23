/**
 *  Java program to create, update, display, and delete an instance of unique values typed long.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // Main method.
    public static void main(String[] args) {

        // Create.
        Set<Long> mySet = new HashSet<>();

        // Add.
        mySet.add(88888888888L);
        mySet.add(777777777777L);
        mySet.add(66666666666666L);
        mySet.add(555555555555555555L);
        mySet.add(444444444L);
        mySet.add(3333333333333333L);

        // Display.
        System.out.println("MySet: " + mySet); // Output: [555555555555555555, 444444444, 66666666666666,
                                               // 3333333333333333, 88888888888, 777777777777]

        // Delete.
        mySet.remove(444444444L);

        // Display.
        System.out.println("MySet: " + mySet); // Output: MySet: [555555555555555555, 66666666666666, 3333333333333333,
                                               // 88888888888, 777777777777]

        // Add.
        mySet.add(2222222222222222222L);

        // Display.
        System.out.println("MySet: " + mySet); // Output: MySet: [555555555555555555, 66666666666666,
                                               // 2222222222222222222, 3333333333333333, 88888888888, 777777777777]

        // Clear.
        mySet.clear();

    }
}