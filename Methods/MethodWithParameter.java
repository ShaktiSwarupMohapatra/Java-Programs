package Methods;
import java.util.Scanner;
public class MethodWithParameter {
    static void add(int a,int b)
    {
        int c= a+b;
        System.out.println(c);
//        return c; can't use return here as no return type
    }

    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        System.out.println("Enter 1st Number");
//        int x=scn.nextInt();
//        System.out.println("Enter 2nd Number");
//        int y=scn.nextInt();
//       add(x,y);
        add(40,55);
        System.out.println("Thank You");
//        System.out.println(c); we can't print c here as c is a local variable that of add methods
    }
}
