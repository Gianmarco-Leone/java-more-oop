// Write a method that takes an input of 1 lowercase letter (and only 1 letter), like a - b - c - z,
// etc., and returns that letter’s ordinal position in the alphabet, i.e. a = 1, b = 2, c = 3… z = 26.
// Do NOT use any conditionals (if/then/else/switch/etc.). Do not use an array. Write unit
// tests to test out the following inputs: a, z, w, f, c, h - which should return: 1, 26, 23, 6, 3, 8
// respectively

package com.gianmarco.moreoop;

public class Exercise4 {

    public static void main(String[] args) {
        System.out.println(convert('a'));
    }

    public static int convert(char letter) {
        // a -> codice ASCII = 97
        // b -> codice ASCII = 98
        // c -> codice ASCII = 99
        // d -> codice ASCII = 100
        // ecc...
        return letter - 96;
    }
}
