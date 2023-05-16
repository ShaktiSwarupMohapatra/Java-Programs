package Blocks;
class A
{
int i=100;
static int j=300;
    {
        System.out.println("Hi Am Nonstatic Blocks Executing");
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("++++++++++++++++");
        i++;
        j++;
    }
    static
    {
        System.out.println("Hi Am Static Blocks Executing");
        System.out.println("j="+j);
        j++;
    }
}
class B
{
    {
        System.out.println("B satrts");
        A a3=new A();
        a3.i++;
        A.j++;
        System.out.println("Hi Am Nonstatatic of B");
        System.out.println("i="+ a3.i);
        System.out.println("j="+ A.j);
        System.out.println("B ends");
    }

}
public class TestBlocks {
    public static void main(String[] args) {
//        A a =new A();
//        A a1 =new A();
//        A a2 =new A();
        B b=new B();
    }
}
