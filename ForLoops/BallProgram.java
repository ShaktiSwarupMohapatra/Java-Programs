package ForLoops;

import java.util.Scanner;

public class BallProgram {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Give the number");
        int n= scn.nextInt();
        for (int i=0,j=0;i<=6;)
        {
            j=(n%6);
            i=n/6;
            System.out.println("Over ="+i+ " And "+" Ball = "+j);
        }

    }
}
