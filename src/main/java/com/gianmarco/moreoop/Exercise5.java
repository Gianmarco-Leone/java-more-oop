// Write a method that does the opposite of Exercise4 - taking a number, 1-26, and returns a
// lowercase letter. 1 would return a, 2 = b, 26 = z, etc.

package com.gianmarco.moreoop;

public class Exercise5 {

    public static void main(String[] args) {
        System.out.println(convert(1));
    }

    public static char convert(int num) {
        // codice ASCII = 97 -> a
        // codice ASCII = 98 -> b
        // codice ASCII = 99 -> c
        // ecc...
        return (char) (num + 96);
    }
}
