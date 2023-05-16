package Recursion;

public class AddDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println(add(604));
    }
    static int add(int n)
    {
        if (n<=9)return n;
        return n%10+add(n/10);
    }
}
