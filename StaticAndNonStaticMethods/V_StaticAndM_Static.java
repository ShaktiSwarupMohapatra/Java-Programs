package StaticAndNonStaticMethods;
class A
{
    static int n;
    public static void m1()
    {
        n=100;
        System.out.println(n);
    }
}
public class V_StaticAndM_Static {
    public static void main(String[] args) {
        A.m1();
    }

}
