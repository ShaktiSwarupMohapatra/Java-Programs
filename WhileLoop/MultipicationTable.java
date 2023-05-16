package WhileLoop;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MultipicationTable {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Please enter the number : ");
        int n= scn.nextInt();
        int i=1;
        if (n<0) System.out.println("No Negatives");
        else
        {
            while (i<=10)
            {
                System.out.println(n + "*" + i + "=" +(n*i));
                i++;

            }
        }

    }
}
