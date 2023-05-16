package Data_Abstraction;
abstract  class A //Abstract class
{
    {
        System.out.println("Hi AM NON Static block");
    }
    static
    {
        System.out.println("HI Am static blocks");
    }
    public void m1() //Generic method (Concret Method)
    {
        System.out.println("Hi Am COncreat method");
    }
    abstract public void m2(); //Abstract method

    abstract public void m3(); //Abstract method

}
class B extends A //Concret Class
{
    @Override
    public void m2()  //overriding Method
    {
        System.out.println("HI AM M2");
    }

    @Override
    public void m3()  //overriding Method
    {
        System.out.println("HI AM M3");
    }
    public void m4()
    {
        System.out.println("Hi Am m4");
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        A a= new B(); //Up casting
        a.m1();
        a.m2();
        a.m3();
        ((B)a).m4(); //Down Casting
    }
}
