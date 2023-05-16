package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        rev(567);
    }
    static void rev(int n)
    {
        if (n<10)
        {
            System.out.println(n);
            return;
        }
        else
        {
            System.out.print(n%10);
            rev(n/10);
        }
    }
}
