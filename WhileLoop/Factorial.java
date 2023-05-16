package WhileLoop;
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Please enter the Number : ");
        int n = scn.nextInt();
        if (n<0) System.out.println("No Negatives");
        else
        {
//            int fact=1;
//            while (n>0)
//            {
//                fact=fact*i;
//                n--;
//            }
            int fact=1;
            int i=1;
            while (i<=n)
            {
                fact=fact*i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
