package BasicJava;
import java.util.Scanner;
public class Break {
    public static void main (String []args)
    {
        System.out.println("Its a program for showing how for loops work");
        System.out.println("Enter the maximum number upto print");
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
//        break use to come out of for loops and switch loops

        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
            {
                if (i==5)
                    break;
//                if we use if before sop then 5 wont be print
            }


        }
        System.out.println("Code ends");
    }
}
