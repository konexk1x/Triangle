package application;

import java.util.Scanner;

public class Triangle {
    private int A, B, C;
    private Scanner scanner;

    public Triangle(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    public Triangle() {
        try {
            scanner = new Scanner(System.in);
            System.out.println("Please, enter the sides of triangle: ");
            System.out.println("Side A: ");
            this.A = scanner.nextInt();
            System.out.println("Side B: ");
            this.B = scanner.nextInt();
            System.out.println("Side C: ");
            this.C = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Not an integer. Please, enter correct value");
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
        if (A > 100 || B > 100 || C > 100) {
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
            System.err.println("Not a triangle!");
    }
}
