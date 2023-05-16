package WhileLoop;
import java.util.Scanner;
public class LengthOfNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Please Enter The Number");
        int n = scn.nextInt();
        int count = 0;
        int i=1;
        if (n<0) System.out.println("No Negatives");
        else
        {
            while (n > 0) {
                count++;
                n /= 10;
            }
            System.out.println(count);
        }
    }

}
