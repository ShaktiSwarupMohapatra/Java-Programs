package BankDevlopment;
import java.util.Scanner;
class Bank
{
    public double rateOI()
    {

        return 00.0;
    }
}
class SBI extends Bank{
    @Override
    public double rateOI() {


        return 0.07;
    }
}
class ICICI extends Bank{
    @Override
    public double rateOI() {

        return 0.10;
    }
}
public class BankTest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the amount");
        double amount= scn.nextDouble();
        SalesMan s1= new SalesMan();
       s1.salesForHome(new SBI(),amount);
    }
}
