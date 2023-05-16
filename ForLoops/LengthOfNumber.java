package ForLoops;
import java.util.Scanner;
public class LengthOfNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Enter the Number");
        int n=scn.nextInt();
        if(n<0) System.out.println("No negatives");
        else
        {
            int count=0;
//            for (int i =0;n<0;i++) as no need of i here and also wrong
            for (;n>0;n/=10)
            {
                count ++;
            }
//           -----------------------OR-------------------------------------
//            for (;n>0;)
//            {
//                count ++;
//                n=n/10;
//            }
//            ---------------------------------------------------------------

            System.out.println(count);
        }
    }

}
