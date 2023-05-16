package BasicJava;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 3;
        int sum = a+b;
        System.out.println(sum);
        Scanner scn= new Scanner (System.in);
        System.out.println("Enter the first number");
        int c = scn.nextInt();
        System.out.println("Enter the second number");
        int d = scn.nextInt();
        int sum2= c+d;
        System.out.println(" The sum of these two nuber is "+sum2);



    }
}