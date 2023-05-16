package Interface;

interface Iter1
{
    void m1();
    void m2();
}
interface Iter2
{
    void m2();
    void m3();
}
class B1 implements Iter1,Iter2
{

    @Override
    public void m1() {
        System.out.println("M1 Of Iter1 Implement Here");
    }

    @Override
    public void m2() {
        System.out.println("M2 Of Iter2 Implement Here");
    }

    @Override
    public void m3() {
        System.out.println("M3 Of Iter 2 Implement Here");
    }
}
public class INterface2 {
    public static void main(String[] args) {
//        Object it=new B1();
//        B1 b=((B1) it);
//        b.m1();
//        b.m2();
//        b.m3();

        //or


        Iter1 iter1=new B1();
        iter1.m1();
        iter1.m2();
        Iter2 iter2=new B1();
        iter2.m2();
        iter2.m3();

        //or
         // extend Iter 1 from Iter 2
        //then creat one object for B reference in Iter 2
        //Iter2 iter2=newB():
        //iter2.m1();//m2()://m3();

    }
}
