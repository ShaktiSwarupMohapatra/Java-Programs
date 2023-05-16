package ForLoops;
import java.util.Scanner;
public class ForLoops {
    public static void main (String []args)
    {
        System.out.println("Its a program for showing how for loops work");
        System.out.println("Enter the maximum number upto print");
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(i);

        }
    }
}
