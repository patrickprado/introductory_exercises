package com.introductory_exercises;

import java.util.Scanner;

/**
 * Created by pprado on 4/22/15.
 */
public class AsteriskMaker {

    private static final String asterisk = "*";

    public static void printOneAsterisk() {
        System.out.println(asterisk);
    }

    public static String repeatString(String string, int n) {
        String repeatedString = new String(new char[n]).replace("\0", string);
        return repeatedString;
    }

    public static void drawHorizontalLine(int n) {
        System.out.println(repeatString(asterisk, n));
    }

    public static void drawVerticalLine(int n) {
        String string = asterisk + "\n";
        System.out.println(repeatString(string, n));
    }

    public static void drawRightTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println(repeatString(asterisk, i));
        }
    }

    public static void drawCenteredTriangule(int n) {
        int numberSpaces = n - 1;
        int numberOfAsterisk = 1;
        String spaces;
        String asterisks;
        for(int i = 1; i <= n; i++) {
            spaces    = repeatString(" ", numberSpaces);
            asterisks = repeatString("*", numberOfAsterisk);
            System.out.println(spaces + asterisks + spaces);
            numberSpaces--;
            numberOfAsterisk = (2 * i) + 1;
        }
    }

    public static void drawTopDiamondWithName(int n, String name) {
        int numberSpaces = n - 1;
        int numberOfAsterisks = 1;
        String spaces;
        String asterisks;
        for(int i = 1; i < n; i++) {
            spaces    = repeatString(" ", numberSpaces);
            asterisks = repeatString("*", numberOfAsterisks);
            System.out.println(spaces + asterisks + spaces);
            numberSpaces--;
            numberOfAsterisks = (2 * i) + 1;
        }
        System.out.println(name);
    }

    public static void drawBaseDiamond(int n) {
        int numberSpaces = 1;
        int numberOfAsterisks;
        String spaces;
        String asterisks;
        for(int i = n-2; i >= 0; i--) {
            numberOfAsterisks = (2 * i) + 1;
            spaces    = repeatString(" ", numberSpaces);
            asterisks = repeatString("*", numberOfAsterisks);
            System.out.println(spaces + asterisks + spaces);
            numberSpaces++;
        }
    }

    public static void drawDiamond(int n) {
        drawCenteredTriangule(n);
        drawBaseDiamond(n);
    }

    public static void drawDiamondWithName(int n) {
        drawTopDiamondWithName(n, "Patrick");
        drawBaseDiamond(n);
    }


}
