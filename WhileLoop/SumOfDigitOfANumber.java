package WhileLoop;
import java.util.Scanner;
public class SumOfDigitOfANumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter the number");
        int n= scn.nextInt();
        if (n<0) System.out.println("No Negatives");
        else
        {
            int sum=0;
            int rem=0;
            while (n>0)
            {
                rem = n%10;
                sum=sum+rem;
                n/=10;

            }
            System.out.println(sum);
        }
    }
}
