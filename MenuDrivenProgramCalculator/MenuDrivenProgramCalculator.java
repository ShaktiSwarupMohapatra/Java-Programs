package MenuDrivenProgramCalculator;

import java.util.Scanner;

public class MenuDrivenProgramCalculator {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcome To My Smart Calculator");
        for (;;)
        {
            System.out.println("Choose Any Of The Following ");
            System.out.println("1. Factorial \n"
                    + "2. Length Calculation \n"
                    + "3. Power Of The number \n"
                    + "4. Niven  NUmber Check \n"
                    + "5. Armstrong Number Check \n"
                    + "6. Strong Number Check\n"
                    + "7. Automorphic Number Check \n");
            System.out.println("Enter your Choice: ");
            int ch=scn.nextInt();
            if (ch==1)
            {
                System.out.println("Factorial Calculation");
                System.out.println("Enter Your Number");
                int n=scn.nextInt();
                if (n<0) System.out.println("No Negatives");
                else
                {
                    System.out.println("Factorial of "+n+" is :"+Utility.factorial(n));
                }
            }
            else if (ch==2)
            {
                System.out.println("Length Calculation");
                System.out.println("Enter Your Number");
                int n=scn.nextInt();
                if (n<0) System.out.println("No Negatives");
                else
                {
                    System.out.println("Length of "+n+" is :"+Utility.length(n));
                }
            }
            else if (ch==3)
            {
                System.out.println("Power Of The number");
                System.out.println("Enter the Base");
                int n=scn.nextInt();
                System.out.println("Enter the Exponential");
                int m=scn.nextInt();
                if (n<0 || m<0) System.out.println("No Negatives");
                else System.out.println("The Power "+m+"33 Of The number "+n+" is :"+Utility.power(n,m));
            }
            else if (ch==4)
            {
                System.out.println("Niven  NUmber Check");
                System.out.println("Enter Your Number");
                int n=scn.nextInt();
                if (n<0) System.out.println("No Negatives");
                else
                {
                    if (n%Utility.niven(n)==0) System.out.println(n+" is a Niven Number");
                    else System.out.println(n+" is not a Niven Number");
                }
            }
            else if (ch==5)
            {
                System.out.println("Armstrong Number Check");
                System.out.println("Enter Your Number");
                int n=scn.nextInt();
                if (n<0) System.out.println("No Negatives");
                else
                {
                    if (n==Utility.armstrong(n)) System.out.println(n+" is a Armstrong Number");
                    else System.out.println(n+" is not a Armstrong Number");
                }
            }
            else if (ch==6)
            {
                System.out.println("Strong Number Check");
                System.out.println("Enter Your Number");
                int n=scn.nextInt();
                if (n<0) System.out.println("No Negatives");
                else
                {
                    if (n==Utility.strong(n)) System.out.println(n+" is a Strong Number");
                    else System.out.println(n+" is not a Strong Number");
                }
            }
            else if (ch==7)
            {
                System.out.println("Automorphic Number Check");
                System.out.println("Enter Your Number");
                int n=scn.nextInt();
                if (n<0) System.out.println("No Negatives");
                else
                {
                    if (n==Utility.automorphic(n)) System.out.println(n+" is a Automorphic Number");
                    else System.out.println(n+" is not a Automorphic Number");
                }
            }
            else
            {
                System.out.println("Sir/Madam your choice is wrong");
                System.out.println("Thats Okay...! , Try again");
                System.out.println("Thank you :) ");
            }

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
