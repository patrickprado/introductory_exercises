package com.introductory_exercises;

/**
 * Created by pprado on 4/23/15.
 */
public class FizzBuzz {

    public void FizzBuzz() {
        for(int i = 1; i <= 100; i++) {
            if(divisibleByThree(i)) {
                if(divisibleByFive(i)) {
                    printDivisibleByThreeAndFive();
                }
                else {
                    printDivisibleByThree();
                }
            }
            else if(divisibleByFive(i)) {
                printDivisibleByFive();
            }
            else {
                System.out.println(i);
            }
        }
    }

    private void printDivisibleByThree() {
        System.out.println("Fizz");
    }

    private void printDivisibleByFive() {
        System.out.println("Buzz");
    }

    private void printDivisibleByThreeAndFive() {
        System.out.println("FizzBuzz");
    }

    public boolean divisibleByThree(int i) {
        if(i % 3 == 0) {
            return true;
        }
        return false;
    }

    public boolean divisibleByFive(int i) {
        if(i % 5 == 0) {
            return true;
        }
        return false;
    }
}
