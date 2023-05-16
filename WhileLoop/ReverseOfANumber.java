package WhileLoop;
import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n= scn.nextInt();
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
            System.out.println(rev);

        }
    }
}
