package Overriding01;
class A9
{
    int i;
    int j;

    public A9(int i, int j) {
        this.i = i;
        this.j = j;
    }

//    @Override
//    public String toString() {
//        return "A{" +
//                "i=" + i +
//                ", j=" + j +
//                '}';
//    }
}
class B9 extends A9{
    int k;

    public B9(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    @Override
    public String toString() {
        return "B9{" +
                "k=" + k +
                ", i=" + i +
                ", j=" + j +
                '}';
    }
}

public class Orriding
{
public static void main(String[] args) {
        B9 b=new B9(5,4,3);
        System.out.println(b);
        }
}
