//if in 143=1!+3!+4! then it is a strong number.....
package WhileLoop;
import java.util.Scanner;
public class StrongNumber {
    public static int factorial(int num)
    {
        int i=num;
        int fact=1;
        while(i>0)
        {
            fact=fact*i;
            i--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter the Number");
        int n=scn.nextInt();
        int temp=n;
        if (n<0) System.out.println("No Negatives");
        else
        {
            int rem=0;
            int sum=0;
            while(n>0)
            {
                rem=n%10;
                sum=sum+factorial(rem);
                n/=10;
            }
            if (temp==sum)
            {
                System.out.println(temp+" is a strong number");
            }
            else
            {
                System.out.println(temp+" is not a strong number");

            }
        }
    }
}
