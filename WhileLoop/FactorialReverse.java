package WhileLoop;
import java.util.Scanner;
public class FactorialReverse {
    public static void main(String[] args) {
        Scanner scn= new Scanner (System.in);
        System.out.println("Enter the Number");
        int n=scn.nextInt();
        if(n<0) System.out.println("No Negatives");
        else
        {
            int rev=0;
            int rem=0;
            while (n>0)
            {
                rem=n%10;
                rev=rev*10+rem;
                n/=10;
            }

            int i=rev;
            int fact=1;
            while(i>0)
            {
                fact=fact*i;
                i--;
            }

            System.out.println(fact);
        }


    }
}
