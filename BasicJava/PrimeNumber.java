package BasicJava;

import java.util.Scanner;
public class PrimeNumber {
    static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=scn.nextInt();
        if (n<0) System.out.println("NO NEGATIVES");
        else
        {
            if (n==2) System.out.println("Prime Number");
            else {
                int count=1;
                for(int i=2;i<=n/2;i++)
                {
                   if(n%i==0){
                       count++;
                       break;
                   }
                }
                if(count==1) System.out.println("Prime Number");
                else System.out.println("Not Prime Number");
            }
        }

    }
}
