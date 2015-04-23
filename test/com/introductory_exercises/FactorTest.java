package com.introductory_exercises;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by pprado on 4/23/15.
 */
public class FactorTest {

    @Test
    public void testGenerateFactorsOf30() {
        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals(list, Factor.generate(30));
    }

    @Test
    public void testGenerateFactorOf1() {
        List<Integer> list = new ArrayList();
        assertEquals(list, Factor.generate(1));
    }

}