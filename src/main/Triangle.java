package main;

import java.util.Scanner;

public class Triangle {
    private byte A, B, C;
    private Scanner scanner;

    public Triangle() {
        try {
            scanner = new Scanner(System.in);
            System.out.println("Please, enter the sides of triangle: ");
            System.out.println("Side A: ");
            this.A = scanner.nextByte();
            System.out.println("Side B: ");
            this.B = scanner.nextByte();
            System.out.println("Side C: ");
            this.C = scanner.nextByte();
        } catch (Exception e) {
            System.err.println("Not a number. Please, enter correct value");
        }
    }

    public boolean notNullLength() {
        if (A == 0 || B == 0 || C == 0) {
            System.out.println("Nullable length. Please, enter value > 0");
            return false;
        } else
            return true;
    }

    public boolean isTriangle() {
        if (A + B > C && B + C > A && A + C > B) {
            return true;
        } else
            System.out.println("Not a triangle!");
        return false;
    }

    public boolean outOfRange() {
        if (A > Byte.MAX_VALUE || B > Byte.MAX_VALUE || C > Byte.MAX_VALUE) {
            System.out.println("Out of range. Please, enter the value from 1 to 127");
            return false;
        } else
            return true;
    }

    public boolean isEquilateral() {
        if (A == B && A == C) {
            return true;
        } else
            return false;
    }

    public boolean isIsosceles() {
        if (A == B || B == C || A == C) {
            return true;
        } else
            return false;
    }

    public void triangleType() {
        if (notNullLength() && isTriangle() && outOfRange()) {
            if (isEquilateral()) {
                System.out.println("This triangle is equilateral");
            } else if (isIsosceles()) {
                System.out.println("This triangle is isosceles");
            } else
                System.out.println("This triangle has different sides");
        } else
            System.out.println("Not a triangle!");
    }
}
