package com.company1;
import java.util.Scanner;

public class YoungPhysicistCodeForces {
    public static String isEquilibrium(int [][] array2D, int n){
        for( int i=0; i<3; i++){
            int sum=0;
            for(int j=0; j<n; j++){
                sum+=array2D[j][i];
            }
            if(sum == 0)
                return "YES";
            return "NO";
        }
    return "NO";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int array2D[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] = input.nextInt();
            }
        }
        System.out.println(isEquilibrium(array2D, n));
    }
}
