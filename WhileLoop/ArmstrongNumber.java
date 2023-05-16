//9474=(9^4)+(4^4)+(7^4)+(4^4) then 9474 is a armstrong number
package WhileLoop;
import java.util.Scanner;
public class ArmstrongNumber {
    public static int length(int num)
    {
        int count=0;
        while (num>0)
        {
            count++;
            num/=10;

        }
        return count;
    }
    public static int power(int base,int exp)
    {
        int i=1;
        int res=1;
        while(i<=exp)
        {
            res=base*res;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=scn.nextInt();
        int temp=n;
        if (n<0) System.out.println("No Nehatives...!!");
        else
        {
            int j=0;
            int sum=0;
            while (n>0)
            {
                int rem=n%10;
                sum=sum+power(rem,length(temp));
                n/=10;
            }
         if (temp==sum)
         {
             System.out.println(temp + " is a Armstrong Number");
         }
         else
         {
             System.out.println(temp + " is not a Armstrong Number");

         }
        }


    }
}
