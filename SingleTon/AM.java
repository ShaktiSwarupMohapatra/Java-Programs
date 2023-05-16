package SingleTon;
class S
{
    private static S t;
    int i=10;
    static int count=0;
    private S()
    {
        i++;
        count++;
        System.out.println("Private constructor get executed here");
    }
    public void display()
    {
        System.out.println("i = "+i);
        System.out.println("Thank you");
    }
    public static S getInstance()
    {
        if(t==null) t=new S();
        return t;
    }
}
public class AM {
    public static void main(String[] args) {
        S s= S.getInstance();
        s.display();
        S s2=S.getInstance();
        s2.display();
    }
}
