package Methods;
import java.util.Scanner;
public class MethodWithReturntype {
    static int add ()
    {
//        Scanner scn= new Scanner (System.in);
//        System.out.println("Enter 1st no");
//        int x=scn.nextInt();
//        System.out.println("Enter 2nd no");
//        int y=scn.nextInt();
//        int r= x+y;
//        return r;
        int a=5;
        int b=4;
        int c= a+b;
        return c;

    }

    public static void main(String[] args) {
//       1st way----
//        int result=add();
//        System.out.println(result);
//        Another way------
        System.out.println(add());
        System.out.println("thankyou");
    }
}
