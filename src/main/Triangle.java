package main;

public class Triangle {
    private int A, B, C;

    public Triangle(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
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
}
