package Type_Casting;
class A
{
    int i=100; //generic datamember
    public void m1() //generic method
    {
        System.out.println("Good Morning");
    }
    public void m2() //overriden method
    {
        System.out.println("Hi");
    }
}
class B extends A{
    int i=200; //spacific datamember
    public void m2() //overriding method
    {
        System.out.println("Hello");
    }
    public void m3() //specific method
    {
        System.out.println("HI good evening");
    }
    public void m4() //specific method
    {
        System.out.println("IIIIIII");
    }
}
public class Up_Down_Casting {
    public static void main(String[] args) {
        A a=new B(); //upcasting
        a.m1(); //can acess generic method of super class
        a.m2(); //can acess overriding method in sub class
        System.out.println(a.i); //can acess generic data member of super class
//        a.m3(); // can not acess specific data member /methods of sub class .....for that it need to down cast the upcasted object
        B b =(B)a; // down casting
        b.m1();
        b.m2();
        b.m3();
        b.m4();


    }
}
