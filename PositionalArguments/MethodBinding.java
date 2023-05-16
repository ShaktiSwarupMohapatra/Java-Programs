package PositionalArguments;

public class MethodBinding {
    public static void m1()
    {
        System.out.println("i am a method with no arg");
    }
    public static void m1(int n)
    {
        System.out.println("i am a method with 1 arg");
    }
    public static void m1(int n1,int n2)
    {
        System.out.println("i am a method with 2 arg");
    }
    public static void m1(int n3,int n4,int n5)
    {
        System.out.println("i am a method with 3 arg");
    }

    public static void main(String[] args) {
        int num=10;
        m1();
        m1(1,2,3);
        m1(4);
        m1(5,6);
        m1(6,7,8);
    }
}
//We can have n number of mehtods with same methodname... but the arguments inside it should be differents.otherwise CE.