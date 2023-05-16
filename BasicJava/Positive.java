package BasicJava;
import java.util.Scanner;
public class Positive {
    public static void main(String[]args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the amount");
        int a = scn.nextInt();
        if(a>0)
        {
            System.out.println("The given number is Possitive");
        }
        else if (a<0)
        {
            System.out.println("The given number is Negative");
        }
        else
        {
            System.out.println("The given number is Zero");
        }


    }

}

