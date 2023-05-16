package BookMyShow;

import java.util.Scanner;

class Theater
{
    int seats=50;
    private static Theater t;
    private Theater()
    {

    }
    public static Theater getInstance()
    {
        if(t==null) t=new Theater();
        return t;
    }
    public void researveSeats(int noOfseats)
    {
        if(noOfseats<seats)
        {
            System.out.println(noOfseats+" Seats Are Available");
            seats-=noOfseats;
            System.out.println(noOfseats+" No of seats are booked");
            System.out.println(seats+ " are available now");
            System.out.println("Thank you for using bookkmyshow");
        }
        else {
            System.out.println(noOfseats + " are not available");
            System.out.println(seats + " are available");
        }
    }
}
class Booking
{
    public void bookingTickets()
    {
        System.out.println("How Many Tickets You Want : ");
        Scanner scn=new Scanner(System.in);
        int tno= scn.nextInt();
        Theater th= Theater.getInstance();
        th.researveSeats(tno);
    }
}

public class BookMyShow {
    public static void main(String[] args) {
        Booking cust1=new Booking();
        cust1.bookingTickets();
        Booking cust2= new Booking();
        cust2.bookingTickets();
    }
}
