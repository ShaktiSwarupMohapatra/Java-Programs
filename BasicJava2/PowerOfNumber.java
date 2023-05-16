package BasicJava2;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
//        System.out.println((int)Math.pow(2,3));
    Scanner scn= new Scanner (System.in);
        System.out.println("Enter the Base");
        int base = scn.nextInt();
        System.out.println("Enter the Exponential");
        int exp=scn.nextInt();
        int res=1;
        for (int i=1;i<=exp;i++)
        {
            res=res*base;
        }
        System.out.println("The output is : "+ res);
    }
}
