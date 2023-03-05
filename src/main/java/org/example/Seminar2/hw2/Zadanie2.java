package org.example.Seminar2.hw2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koll chisel");
        int n = sc.nextInt();
        int mass[] = new int[n];
        for (int i = 0; i<n; i++) {
            System.out.println("Vvod");
            mass[i] = sc.nextInt();
        }
        System.out.println(isBigger(mass));

    }
    public static String isBigger ( int[] mass){
        if (mass.length <= 1) {
            return "Posled 0";
        }
        for (int i= 1; i< mass.length; i++) {
            if (mass [i-1] > mass[i]) {
                return "Ne vozrast";
            }
        }
        return "Vozrast";
    }

}
