package com.muhammed;

public class Main {
    static double x0 = 23.0;
    static double a = 4.801;
    static int c = 83;
    static double mod = 8.192;

    public static void main(String[] args) {

        double x1 = lcg(x0, a, c, mod);
        double x2 = lcg(x1, a, c, mod);

        //before normalization
        System.out.println("before normalization process X1 : " + x1);
        System.out.println("before normalization process X2 : " + x2);

        //normalization
        x1 = x1 / mod;
        x2 = x2 / mod;

        System.out.println("after normalization process X1 : " + x1);
        System.out.println("after normalization process X2 : " + x2);

    }

    public static double lcg(double xBaslangic, double a, int c, double mod) {
        return (a * xBaslangic + c) % mod;
    }

}