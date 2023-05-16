package WhileLoop;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter the Number");
        int n=scn.nextInt();
        int temp=n;
        if (n<0) System.out.println("No Negatives");
        else
        {
            int rem=0;
            int rev=0;
            while (n>0)
            {
                rem=n%10;
                rev=rev*10+rem;
                n/=10;
            }
            System.out.println("The reverse of the given number : "+ temp +" = " + rev);
            int sum=0;
            int rem2=0;
            int i=0;
            while (i<3)
            {
                rem2=temp%10;
                sum=rem2+sum;
                temp=temp/10;
                i++;
            }
            System.out.println("The sum of the 1st 3 number is : "+ sum);
        }
    }
}
