package com.company1;
import java.util.Scanner;

public class YoungPhysicistCodeForces {
    public static String isEquilibrium(int sum, int sumX, int sumY, int sumZ){
        if (sum == 0 && sumX == 0 && sumY == 0 && sumZ == 0)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int sum = 0;
        int sumX = 0; int sumY = 0; int sumZ = 0;

        for(int i=0; i<n; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();

            sum += x + y + z;
            sumX += x;
            sumY += y;
            sumZ += z;
        }
        System.out.println(isEquilibrium(sum, sumX, sumY, sumZ));
    }
}
