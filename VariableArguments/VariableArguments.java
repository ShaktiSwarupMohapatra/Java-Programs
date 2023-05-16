package VariableArguments;

public class VariableArguments {
    public static void m1(int...arr)
    {
        System.out.println("HELLO WORLD");
    }

    public static void main(String[] args) {
        m1(2,3);
        m1(1);
        m1();
    }
//int...arr is used when the user dont know the number of arguments to pass...
//    but the only condition is all the arguments type should be int here....
}
