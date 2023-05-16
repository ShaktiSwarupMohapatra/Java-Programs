package BasicJava;
import java.util.Scanner;
public class Marks {
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter Students Name");
        String str = scn.nextLine();
        System.out.println("Enter Total no of Subject");
        double n=scn.nextDouble();
        System.out.println("Marks in English");
        int s1 =scn.nextInt();
        System.out.println("Marks in Math");
        int s2 =scn.nextInt();
        System.out.println("Marks in Mil");
        int s3 =scn.nextInt();
        System.out.println("Marks in Geography");
        int s4 =scn.nextInt();
        System.out.println("Marks in History");
        int s5 =scn.nextInt();
        System.out.println("Marks in Hindi");
        int s6 =scn.nextInt();
        int avg= (int) ((s1+s2+s3+s4+s5+s6)/n);
        if(s1<35||s2<35||s3<35||s4<35||s5<35||s6<35)
        {
            System.out.println(" Student "+ str +" is failed ");
        }
        else
        {
            if(avg>90)
            {
                System.out.println(str + "is passed with grade A and the average mark is " + avg);
            }
            else if (avg>80)
            {
                System.out.println( str + "is passed with grade B and the average mark is " + avg);
            }
            else if (avg>70)
            {
                System.out.println( str + "is passed with grade C and the average mark is " + avg);
            }
            else if (avg>60)
            {
                System.out.println( str + "is passed with grade D and the average mark is " + avg);
            }
            else if (avg>50)
            {
                System.out.println( str + "is passed with grade E and the average mark is " + avg);
            }
            else if (avg>40)
            {
                System.out.println( str + "is passed with grade F and the average mark is " + avg);
            }
        }

    }

}
