package com.introductory_exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pprado on 4/23/15.
 */
public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void divisibleByThree() {
        assertTrue(fizzBuzz.divisibleByThree(18));
    }

    @Test
    public void divisibleByFive() {
        assertTrue(fizzBuzz.divisibleByFive(25));
    }

}