package com.muhammed;

public class Main {
    static double x0 = 23.0;
    static double a = 4.801;
    static int c = 83;
    static double mod = 8.192;

    public static void main(String[] args) {

        double x1 = lcgUret(x0, a, c, mod);
        double x2 = lcgUret(x1, a, c, mod);

        //normalization
        x1 = x1 / mod;
        x2 = x2 / mod;

        System.out.println("X1 : " + x1);
        System.out.println("X2 : " + x2);

    }

    public static double lcgUret(double x0, double a, int c, double mod) {
        return (a * x0 + c) % mod;
    }

}