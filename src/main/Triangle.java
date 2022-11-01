package main;

import java.util.Scanner;

public class Triangle {
    private byte A, B, C;
    private Scanner scanner;

    public Triangle() {
        scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника: ");
        System.out.println("Сторона A: ");
        this.A = scanner.nextByte();
        System.out.println("Сторона B: ");
        this.B = scanner.nextByte();
        System.out.println("Сторона C: ");
        this.C = scanner.nextByte();
    }

    public boolean notNullLength() {
        if (A == 0 || B == 0 || C == 0) {
            return false;
        } else
            return true;
    }

    public boolean isTriangle() {
        if (A + B > C && B + C > A && A + C > B) {
            return true;
        } else
            return false;
    }

    public boolean outOfRange() {
        if (A > Byte.MAX_VALUE || B > Byte.MAX_VALUE || C > Byte.MAX_VALUE) {
            return false;
        } else
            return true;
    }
}
