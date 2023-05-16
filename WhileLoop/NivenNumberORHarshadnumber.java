//Niven Number is in 27----(2+7=9),if 27 is a factorial of 9 then 27 is a niven number
//1 to 9 all are niven number.........
package WhileLoop;
import java.util.Scanner;
public class NivenNumberORHarshadnumber {
    public static int sum(int num)
    {
        int rem=0;
        int sum2=0;
        while(num>0)
        {
            rem=num%10;
            sum2=rem+sum2;
            num/=10;
        }
        return sum2;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter the Number");
        int n=scn.nextInt();
        if (n<0) System.out.println("No Negatives");
        else
        {
            int r= sum(n);
            if (n%r==0)
            {
                System.out.println(n +" is a Niven Number");
            }
            else
            {
                System.out.println(n +"is not a Niven NUmber");
            }
        }



    }
}
