package Type_Casting;
class A2
{
    int i=100;
    public void m1(){
        System.out.println("Hello ");
    }
    public void m2()
    {
        System.out.println("Hey");
    }
}
class B2 extends A2{
    int i=200;
    @Override
    public void m2() {
        System.out.println("Good day");
    }
    public void m3()
    {
        System.out.println("Hi am m3 of B2");
    }
}
public class Downcasting01 {
    public static void main(String[] args) {
        A2 a= new B2();
        a.m1();
        a.m2();
//        a.m3(); Not Accessable
        System.out.println(a.i);
        B2 b= (B2) a;
        b.m3();b.m2();
        b.m1();
        System.out.println(b.i);
    }
}
