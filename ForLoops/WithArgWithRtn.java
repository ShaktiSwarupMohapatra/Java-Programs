package ForLoops;
import java.sql.SQLOutput;
import java.util.Scanner;
public class WithArgWithRtn {
    public static int factorial(int n)
    {
        int fact=1;
        for (int i = 1; i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner scn= new Scanner (System.in);
        System.out.println("please enter the number");
        int n =scn.nextInt();
//        int result = factorial(n);
//        System.out.println(result);
        System.out.println(factorial(n));
        System.out.println("Hello world");
    }
}
