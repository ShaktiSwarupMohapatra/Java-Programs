package Recursion;

public class Test {
    public static void main(String[] args) {

        m1(5);
    }

    private static void m1(int i) {
        System.out.println("M1 starts");
        System.out.println(i);
        m1(i+1);
        System.out.println("M1 ends");
    }
}
