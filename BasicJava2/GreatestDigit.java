package BasicJava2;
import java.util.Scanner;
public class GreatestDigit {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter The Number: ");
        int n=scn.nextInt();
        int temp=n;
        if (n<0) System.out.println("No Negatives");
        else
        {
            int y=0;
            while(n>0)
            {
                int rem=n%10;
                if (rem>y)
                {
                    y=rem;
                }
                n/=10;
            }
            System.out.println("The Greatest Digit in Number "+temp+" is : "+y);

        }

    }
}
