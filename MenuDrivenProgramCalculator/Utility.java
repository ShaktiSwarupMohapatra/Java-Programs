package MenuDrivenProgramCalculator;
import java.util.Scanner;
public class Utility {
    public static int length(int num)
    {
        int count=0;
        while (num>0)
        {
            count++;
            num/=10;
        }
        return count;
    }
    public static int power(int base,int exp)
    {
        int pwr=1;
        int i=1;
        while(i<=exp)
        {
            pwr*=base;
            i++;
        }
        return pwr;
    }
    public static int factorial(int num2)
    {
        int fact=1;
        int j=1;
        while (j<=num2)
        {
            fact*=j;
            j++;
        }
        return fact;
    }
    public static int strong(int num3)
    {
        int sum3 =0;;
        while (num3>0)
        {
            sum3+=factorial(num3%10);
            num3/=10;
        }
        return sum3;
    }
    public static int armstrong(int num4)
    {
        int sum4=0;
        int temp=num4;
        while (num4>0)
        {
            sum4+=power(num4%10,length(temp));
            num4/=10;
        }
        return sum4;
    }
    public static int automorphic(int num5)
    {
        int res5=power(num5,2)%power(10,length(num5));
        return res5;
    }
    public static int niven(int num6)
    {
        int sum6=0;
        while (num6>0)
        {
            sum6+=num6%10;
            num6/=10;
        }
        return sum6;
    }
//    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        System.out.println("Enter the Number");
//        int n=scn.nextInt();
//        System.out.println(niven(n));
//    }
}
