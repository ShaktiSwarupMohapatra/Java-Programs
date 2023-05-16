package BankDevlopment;

public class SalesMan {
    public void salesForHome(Bank bank, Double amount)
    {
       double r= bank.rateOI();
       double ri= r*100;
       int roi= (int) ri;
        System.out.println(roi+"% is the rate of intrest charged by "+bank.getClass().getSimpleName()+"bank");


        double intrestCharged=amount*r;
        System.out.println(intrestCharged+" is the rate of intrest charged for the amount "+amount+" by "+bank.getClass().getSimpleName()+" bank");
        double totalAmount=amount+intrestCharged;
        System.out.println(totalAmount+ " is the total amount to be paid for "+ bank.getClass().getSimpleName()+" for the amount "+amount);

    }
}
