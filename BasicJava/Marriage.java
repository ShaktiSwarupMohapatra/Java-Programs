package BasicJava;
import java.util.Scanner;
public class Marriage {
    public static void main(String[]args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter boys age");
        int b = scn.nextInt();
        System.out.println("Enter girls age");
        int g = scn.nextInt();

        if((b>=21) &&(g>=21))
        {
            System.out.println("Both are Eligible for marriage");
        }
        else
        {
            System.out.println("Not eligible for marriage");
        }


    }

}
