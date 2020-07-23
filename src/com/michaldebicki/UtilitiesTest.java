package com.michaldebicki;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utilities;

    @org.junit.Before
    public void setup(){
        utilities = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        char [] inputChar = {'h','e','l','l','o'};
        char [] expectedResult ={'e','l'};
        //char [] expectedResult ={'h','e','l','l','o','o'};
        assertArrayEquals(expectedResult,utilities.everyNthChar(inputChar,2));
    }

    @org.junit.Test
    public void removePairs() {
        String result = utilities.removePairs("AABCDDEFF");
        assertEquals("ABCDEF",result);
        assertEquals("A",utilities.removePairs("A"));
        assertEquals("",utilities.removePairs(""));
        assertEquals("ABCBCBCB",utilities.removePairs("ABCBBCBBBCBB"));

    }

    @org.junit.Test
    public void converter() {
        assertEquals(300,utilities.converter(10,5));
    }
    @org.junit.Test (expected = ArithmeticException.class)
    public void converter2()  {
        utilities.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertEquals("Bobeka",utilities.nullIfOddLength("Bobeka"));
    }

    @org.junit.Test
    public void nullIfOddLength2() {
        assertNull("Nullowanie i spadanie",utilities.nullIfOddLength("Bobek"));
    }
}