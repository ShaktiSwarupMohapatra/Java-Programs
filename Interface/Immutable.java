package Interface;
class A1
{
    int x;
    public A1(int x)
    {
        this.x=x;
    }
    public A1 modify(int x) //type of helper method/factory method
    {
        if(this.x!=x) return new A1(x);
        return this; // cant write this.x coz it cant return int type as return type is class type ...A1
    }
}
public class Immutable {
    public static void main(String[] args) {
        A1 a1= new A1(10);
        System.out.println(a1);
        A1 a2=a1.modify(10); // new referance to same object
        A1 a3=a1.modify(20); //creat a new object
        System.out.println(a2);
        System.out.println(a3);


    }
}
