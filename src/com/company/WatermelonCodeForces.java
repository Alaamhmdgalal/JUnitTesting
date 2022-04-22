package com.company;
import java.util.Scanner;

public class WatermelonCodeForces {
    public static String isEven(int n){
        if ( n % 2 == 0 && n != 2)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        System.out.println(isEven(w));
    }
}