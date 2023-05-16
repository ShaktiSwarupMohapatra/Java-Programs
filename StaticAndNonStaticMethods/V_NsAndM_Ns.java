package StaticAndNonStaticMethods;
class D
{
    int n;
    public void m1()
    {
        n=400;
        System.out.println(n);
    }
}
public class V_NsAndM_Ns {
    public static void main(String[] args) {
        D d=new D();
        d.m1();
    }
}
