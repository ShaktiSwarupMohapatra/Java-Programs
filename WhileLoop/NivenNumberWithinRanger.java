package WhileLoop;
import java.util.Scanner;
public class NivenNumberWithinRanger {
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
        System.out.println("Enter the range: ");
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int i=1;
        while (i<=n)
        {
            if(i%sum(i)==0)
            {
                System.out.println(i);
                i++;
            }

        }

    }
}
