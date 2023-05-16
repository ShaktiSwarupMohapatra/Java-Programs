package Arrays;

public class Sorting_Bubble {
    public static void main(String[] args) {
        int []a={99,5,6,7,3,2,7};
        display(a);
        sort(a);
        display(a);
    }
    public static void sort(int []a)
    {
        for (int i=0;i<=a.length-1;i++)
            for (int j=0;j<a.length-1-i;j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
    }
    public static void display(int []a)
    {
        for (int n:a) System.out.println(n);
    }
}
