/*
Nama : Nurani Syahidah
NIM  : 2200462
*/
package tugaspertemuan7;

import java.util.Scanner;

public class LinearEquation {
    private double a, b, c, d, e, f;

    // Constructor
    public LinearEquation() {
        this(0, 0, 0, 0, 0, 0);
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    //Method mengembalikan nilai true jika ad - bc tidak sama dengan 0.
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // Methods getX() and getY() mengembalikasi solusi untuk persamaan x dan y.
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai a, b, c, d, e, f:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("Solusi untuk persamaan:");
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }

        scanner.close();
    }
}
