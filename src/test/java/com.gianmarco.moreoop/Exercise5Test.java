// Write a method that does the opposite of Exercise4 - taking a number, 1-26, and returns a
// lowercase letter. 1 would return a, 2 = b, 26 = z, etc.

package com.gianmarco.moreoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {

    @Test
    public void convert1() {
        char letter = Exercise5.convert(1);
        assertEquals('a', letter);
    }

    @Test
    public void convert2() {
        char letter = Exercise5.convert(2);
        assertEquals('b', letter);
    }

    @Test
    public void convert26() {
        char letter = Exercise5.convert(26);
        assertEquals('z', letter);
    }
}