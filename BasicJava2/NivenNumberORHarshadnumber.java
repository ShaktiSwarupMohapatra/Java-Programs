//Niven Number is in 27----(2+7=9),if 27 is a factorial of 9 then 27 is a niven number
//1 to 9 all are niven number.........
package BasicJava2;

import java.util.Scanner;

public class NivenNumberORHarshadnumber {
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
                sum=rem+sum;
                n/=10;
            }
            if (temp%sum==0)
            {
                System.out.println(temp +" is a Niven Number");
            }
            else
            {
                System.out.println(temp +"is not a Niven NUmber");
            }
        }


    }
}
