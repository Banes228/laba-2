package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double S = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n ");
        double n = in.nextDouble();
        System.out.println("Введите x");
        int x = in.nextInt();
        // проверка отрицательности n
        if (n % 2 < 0) {
            System.out.println("n должен быть положительным");
        }
        else{
            for (int j = 0; j <= n; j++) {
                double e  = Math.pow(-1, n) * Math.pow(x, n) / getFactorial(n);
                S = S + e;
            }
        }
        System.out.println(S);
    }
    //Считает факториал
    public static double getFactorial(double f) {
        double result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
