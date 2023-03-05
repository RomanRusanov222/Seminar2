package org.example.Seminar2.hw2;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Koll chisel");
        int n = sc.nextInt();
        int mass[] = new int[n];
        for (int i = 0; i<n; i++) {
            System.out.println("Vvod");
            mass[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<mass.length; i++) {
            if (mass[i]>=10 && mass[i] <=99 || mass[i]>= -99 && mass[i]<=-10) {
                sum = sum + i;
            }
        }
        for (int i = 0; i< mass.length; i++ ) {
            if (mass[i]<0) {
                mass[i] = sum;
            }
        }
        System.out.println(toString(mass));

    }
    public static String toString ( int [] mass) {
        String res = "";
        for (int i = 0; i<mass.length; i++){
            res = res+mass[i] + " ";
        }
        return res;
    }
}
