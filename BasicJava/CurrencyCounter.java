package BasicJava;
import java.util.Scanner;
public class CurrencyCounter {
    public static void main(String[]args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the amount");
        int a = scn.nextInt();
        if(a>=2000)
        {
            int c2000= a/2000;
            a=a%2000;
            System.out.println("2000 *"+c2000+ "=" +(2000*c2000));
        }
        if (a>=500)
        {
            int c500=a/500;
            a=a%500;
            System.out.println("500 *"+ c500+"="+(c500*500));
        }
        if (a>=200)
        {
            int c200=a/200;
            a=a%200;
            System.out.println("200 *"+ c200+"="+(c200*200));
        }
        if (a>=100)
        {
            int c100=a/100;
            a=a%100;
            System.out.println("100 *"+ c100+"="+(c100*500));
        }
        if (a>=50)
        {
            int c50=a/50;
            a=a%50;
            System.out.println("50 *"+ c50+"="+(c50*50));
        }
        if (a>=10)
        {
            int c10=a/10;
            a=a%10;
            System.out.println("10 *"+ c10+"="+(c10*10));
        }
        if (a>=1)
        {
            int c1=a/1;
            a=a%1;
            System.out.println("1 *"+ c1+"="+(c1*1));
        }

    }

}
