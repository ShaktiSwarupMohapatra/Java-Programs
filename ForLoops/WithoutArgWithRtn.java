package ForLoops;
import java.util.Scanner;
public class WithoutArgWithRtn {
    //    WITHOUT TAKING INPUT FROM USER
//    ---------------------------------------------
//    public static int factorial()
//    {
//        int n=5;
//        int fact=1;
//        for (int i=1;i<=5;i++)
//        {
//            fact = fact*i;
//
//        }
//        return fact;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(factorial());
//    }
//    WITH TAKING INPUT FROM USER
//    -----------------------------------------
    public static int factorial ()
    {
        int fact=1;
//        for (int i = 1; i<=n;i++)
        {
//            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();

    }
}
