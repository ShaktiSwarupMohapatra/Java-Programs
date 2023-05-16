package Phone;

import java.util.Scanner;

class Air
{
    String simname;
    public Air(String simname)
    {
        this.simname=simname;
    }
    public void callUsingAir()
    {
        System.out.println("Call through "+ simname+" Internet Not Avilable");
    }
}
class Jio
{
    String simname;
    public Jio(String simname)
    {
        this.simname=simname;
    }
    public void callUsingJio()
    {
        System.out.println("Call through "+ simname+" Internet Avilable");
    }
}
class Battery
{
    String batteryName;
    public Battery(String batteryName)
    {
        this.batteryName=batteryName;
    }
}
class Phone
{
    String phoneName;
    Jio jio;
    Air air;
    Battery btr;
    public Phone(String phoneName,Battery btr)
    {
        this.phoneName=phoneName;
        this.btr=btr;
    }
    public void call()
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("1.Jio /n" +
                "2.Airtel ");
        int sim=scn.nextInt();
        switch (sim)
        {
            case 1: jio =new Jio("JIO");
                    jio.callUsingJio();
                    break;
            case 2: air=new Air("AIRTEL");
                    air.callUsingAir();
                    break;
        }
    }
}
public class PhoneDevlopement {
    public static void main(String[] args) {
        Battery b1= new Battery("Lithium-ion");
        Phone p1=new Phone("Nokia",b1);
        p1.call();

    }
}
