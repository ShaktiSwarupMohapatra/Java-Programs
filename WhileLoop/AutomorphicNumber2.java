//Automerphic number is
//6^2=36//25^2=625/625^2=390625
//6^2=36%10^1//25^2=625%10^2//
//So the exponential is depending on the length of input..
//so we need to find length then power then modulusand then equate to input....
package WhileLoop;
import java.util.Scanner;
public class AutomorphicNumber2 {
    public static int length(int num)
    {
        int count=0;
        while (num>0)
        {
            count++;
            num=num/10;

        }
        return count;
    }
    public static int power(int base, int exp)
    {
        int res=1;
        int i=1;
        while(i<=exp)
        {
            res=res*base;
            i++;
        }
        return res;
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=scn.nextInt();
        if (n<0) System.out.println("No negatives");
        else
        {
        int p=power(n,2);
        int y=power(10,length(n));
        int x=p%y;

//            int x=power(n,2)%power(10,length(n));
            if (n==x)
            {
                System.out.println("y");
            }
            else
            {
                System.out.println("n");
            }
        }



    }

}
