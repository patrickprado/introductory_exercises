package com.introductory_exercises;

/**
 * Created by pprado on 4/23/15.
 */
public class Prime {

    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        if(n == 1 || n % 2 == 0) {
            return false;
        }
        for(int i = 3; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
