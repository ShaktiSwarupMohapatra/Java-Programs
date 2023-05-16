package Basics;

public class MethodsOfStringClass {
    public static void main(String[] args) {
        char [] a= {' ','a','b','c',' ','@','$'};
        String s=new String(a);
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.equalsIgnoreCase("abC @$"));
        System.out.println(s.contains("D"));
        System.out.println(s.contains("A"));
        System.out.println(s.contains("a"));
        System.out.println(s.contains(" "));
        System.out.println(s.startsWith("a"));
        System.out.println(s.startsWith("A"));
        System.out.println(s.endsWith("$"));
        System.out.println(s.toUpperCase());
        System.out.println(s);
        System.out.println(s=s.toUpperCase());
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.length());
        System.out.println(s=s.trim());
        System.out.println(s.length());
        char[]b=s.toCharArray();
        System.out.println(b);
        System.out.println(b.length);
        char c= b[1];
        System.out.println(c);

    }
}
