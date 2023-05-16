package WhileLoop;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        for (;;)
        {
            System.out.println("Enter the Base");
            int base=scn.nextInt();
            System.out.println("Enter the exponential");
            int exp=scn.nextInt();
            int res=1;
            int i=1;
            while (i<=exp)
            {
                res=res*base;
                i++;
            }
            System.out.println(res);

            System.out.println("Do you want to continue? Y/y ");
            char ch2 = scn.next().charAt(0);

            if(ch2 == 'y' || ch2 == 'Y')
                continue;
            else
            {
                System.out.println("Sir/Madam, Its so nice having you..!");
                System.out.println("Thank you for  using the software");
                System.out.println("Visit Again");
                break;
            }
        }

    }
}
