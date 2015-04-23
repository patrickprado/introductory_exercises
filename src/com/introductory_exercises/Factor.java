package com.introductory_exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pprado on 4/23/15.
 */
public class Factor {


    public static List<Integer> generate(int n) {
        List<Integer> factorsList = new ArrayList();
        for(int i = 2; i < n; i++) {
            if(n % i == 0 && Prime.isPrime(i)) {
                factorsList.add(i);
            }
        }
        return factorsList;
    }

    public static void printFactors(int n) {
        List<Integer> list = generate(n);
        for(Integer i : list) {
            System.out.println(i);
        }
    }

}
