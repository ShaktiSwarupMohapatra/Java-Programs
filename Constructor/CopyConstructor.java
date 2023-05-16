package Constructor;
class A
{
    int i;
    int j;
    int k;
    public A(int i,int j,int k)
    {
        this.i=i;
        this.j=j;
        this.k=k;
    }
    public A(int i,A a,int k)
    {
        this.i=i;
        this.j=a.j;
        this.k=k;
    }
    public A(A a,int j,A b)
    {
        this.i=a.i;
        this.j=j;
        this.k=b.k;
    }
    public A(A a,int j,int k)
    {
        this.i=a.i;
        this.j=j;
        this.k=k;
    }

    public void display()
    {
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("k = "+k);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        A a1=new A(10,50,60);
        a1.display();
        A a2=new A(15,a1,20);
        a2.display();
        A a3=new A(a2,35,a2);
        a3.display();
        A a4=new A(a1,35,50);
        a4.display();

    }
}
