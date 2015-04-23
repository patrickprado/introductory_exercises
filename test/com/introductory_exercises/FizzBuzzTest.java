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
    public void testDivisibleByThree() throws Exception {
        assertTrue(fizzBuzz.divisibleByThree(27));
    }

    @Test
    public void testDivisibleByFive() throws Exception {
        assertTrue(fizzBuzz.divisibleByFive(25));
    }
}