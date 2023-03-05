package org.example.Seminar2.hw2;

public class Zadanie1 {

    public static void main(String ... args) {
        int[] mass = new int[] {1,2,3,5,4,6,7,9,10,13};
        int sum = 0;
        for (int i = 0 ; i < mass.length; i++) {
            int current = mass[i];
            if (isSimple(current) ) {
                sum = sum+current;
            }
        }
        System.out.println(sum);
    }

    public static boolean isSimple(int a){
        if (a==0 || a==1 || a==2){
            return true;
        }
        for (int i = 2; i<=a/2; i++) {
            if (a%i==0) {
                return false;
            }
        }
        return true;

    }

}
