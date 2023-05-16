package Basics;

import java.util.Locale;

public class Pallindrom {
    static boolean ispallindrom(String s)
    {
        s=s.toLowerCase();
        char []a=s.toCharArray();
        int i=0,j=a.length-1;
        for(;i<j;i++,j--){
        if(a[i]==a[j]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ispallindrom("javaj"));
        System.out.println(ispallindrom("java"));
        System.out.println(ispallindrom("MalaYalam"));
    }
}
