package Constructor;
class Aa
{
    int i=10;
    static int count=0;
    private Aa()
    {
        i++;
        count++;
        System.out.println("Private Constructor grt executed");
    }
    public static Aa getInstance() //Helper Methods /Factory Method
    {
//        return new Aa();
        Aa a=new Aa();
        return a;
    }
    public void display()
    {
        System.out.println("i="+i);
    }
}
public class PrivateConstructor {
    public static void main(String[] args) {
        Aa a1= Aa.getInstance();
        a1.display();
        Aa a2= Aa.getInstance();
        a2.display();
        Aa a3= Aa.getInstance();
        a3.display();
        System.out.println("The object created is"+ Aa.count);
        System.out.println(a1==a2);

    }
}
