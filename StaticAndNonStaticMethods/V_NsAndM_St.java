package StaticAndNonStaticMethods;
class B
{
    int n;
    public static void m1()
    {
        B b=new B();
        b.n=100;
        System.out.println(b.n);
    }
}
public class V_NsAndM_St {
    public static void main(String[] args) {
        A.m1();
    }
}
