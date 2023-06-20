// Write a method that takes an input of 1 lowercase letter (and only 1 letter), like a - b - c - z,
// etc., and returns that letter’s ordinal position in the alphabet, i.e. a = 1, b = 2, c = 3… z = 26.
// Do NOT use any conditionals (if/then/else/switch/etc.). Do not use an array. Write unit
// tests to test out the following inputs: a, z, w, f, c, h - which should return: 1, 26, 23, 6, 3, 8
// respectively

package com.gianmarco.moreoop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    @Test
    public void convertLowerA() {
        int num = Exercise4.convert('a');
        assertEquals(1, num);
    }

    @Test
    public void convertLowerZ() {
        int num = Exercise4.convert('z');
        assertEquals(26, num);
    }

    @Test
    public void convertLowerW() {
        int num = Exercise4.convert('w');
        assertEquals(23, num);
    }

    @Test
    public void convertLowerF() {
        int num = Exercise4.convert('f');
        assertEquals(6, num);
    }

    @Test
    public void convertLowerC() {
        int num = Exercise4.convert('c');
        assertEquals(3, num);
    }

    @Test
    public void convertLowerH() {
        int num = Exercise4.convert('h');
        assertEquals(8, num);
    }
}