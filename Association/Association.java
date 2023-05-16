package Association;
class A
{
    int i=4;
    public void m1()
    {
        System.out.println("M1 starts");
        i++;
        System.out.println("i="+i);
        System.out.println("M1 ends");
    }
}
class B
{
    public void m2()
    {
        System.out.println("M2 starts");
//        System.out.println(i);
        A a =new A();
        a.m1();
        a.i++;
        System.out.println("i="+a.i);
        System.out.println("M2 ends");
    }
}
public class Association {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        B b= new B();
        b.m2();
        System.out.println("Mian ends");
    }
}
