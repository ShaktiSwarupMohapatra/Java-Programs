package Call_to_super;
class A
{
    A()
    {
        System.out.println("A Cons");
    }
    A(int m)
    {
        System.out.println("A2 Cons");
    }
}
class B extends A
{
    B()
    {

    }

}
class C extends B
{
    C()
    {
        System.out.println("C Cons");
    }
    C(int r)
    {
        System.out.println("C2 Cons");
    }
}
public class Demo {
    public static void main(String[] args) {
        C c=new C(7);
//        B b=new B();
    }

}
