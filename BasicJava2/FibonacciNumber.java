package BasicJava2;
import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Fibonacci number");
        int n=scn.nextInt();
        int a=0;
        int b=1;
        int c=0;
        if (n==1)
        {
            System.out.println(0);
            return;
        }
        else
        {
            System.out.println(a+" "+b);
            int i=3;
            while (i<=n)
            {
               c=a+b;
                System.out.println(" "+c);
                a=b;
                b=c;
                i++;
            }
        }
    }
}
