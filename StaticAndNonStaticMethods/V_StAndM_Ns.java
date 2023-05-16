package StaticAndNonStaticMethods;
class C
{
    static int n;
    public void m1()
    {
        n=200;
        System.out.println(n);
    }
}
public class V_StAndM_Ns {
    public static void main(String[] args) {
        C c=new C();
        c.m1();

    }
}
