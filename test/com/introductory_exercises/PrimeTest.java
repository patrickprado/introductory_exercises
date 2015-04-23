package com.introductory_exercises;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pprado on 4/23/15.
 */
public class PrimeTest {

    @Test
    public void testIsPrime() {
        assertTrue(Prime.isPrime(2));
    }
    @Test
    public void testIsNotPrime() {
        assertFalse(Prime.isPrime(18));
    }
}