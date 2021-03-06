package com.introductory_exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        triangleExercises();
        diamondExercises();
        fizzBuzzExercises();
        primeFactorsExercises();
    }

    private static void triangleExercises() {
        AsteriskMaker.printOneAsterisk();
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()) {
            int n = Integer.parseInt(scanner.next());
            AsteriskMaker.drawHorizontalLine(n);
        }

        Scanner scannerVertical = new Scanner(System.in);
        if(scannerVertical.hasNext()) {
            int n = Integer.parseInt(scannerVertical.next());
            AsteriskMaker.drawVerticalLine(n);
        }

        Scanner scannerRightTriangle = new Scanner(System.in);
        if(scannerRightTriangle.hasNext()) {
            int n = Integer.parseInt(scannerRightTriangle.next());
            AsteriskMaker.drawRightTriangle(n);
        }

    }

    private static void diamondExercises() {
        Scanner scannerCenteredTriangle = new Scanner(System.in);
        if(scannerCenteredTriangle.hasNext()) {
            int n = Integer.parseInt(scannerCenteredTriangle.next());
            AsteriskMaker.drawCenteredTriangule(n);
        }

        Scanner scannerDiamond = new Scanner(System.in);
        if(scannerDiamond.hasNext()) {
            int n = Integer.parseInt(scannerDiamond.next());
            AsteriskMaker.drawDiamond(n);
        }

        Scanner scannerDiamondWithName = new Scanner(System.in);
        if(scannerDiamondWithName.hasNext()) {
            int n = Integer.parseInt(scannerDiamondWithName.next());
            AsteriskMaker.drawDiamondWithName(n);
        }
    }

    private static void fizzBuzzExercises() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.FizzBuzz();
    }


    private static void primeFactorsExercises() {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()) {
            Factor.printFactors(Integer.parseInt(scanner.next()));
        }
    }
}
