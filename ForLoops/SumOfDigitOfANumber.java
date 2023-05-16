package ForLoops;
import java.util.Scanner;
public class SumOfDigitOfANumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=scn.nextInt();
        int sum=0;
        int rem =0;
        if (n<0) System.out.println("No Negatives");
        else
        {
            for (;n>0;)
            {
                rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            System.out.println(sum);
        }


    }
}
