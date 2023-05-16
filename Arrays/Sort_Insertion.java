package Arrays;

public class Sort_Insertion {
    public static void main(String[] args) {
        int a[]={4,9,6,30};
        sort(a);
        display(a);

    }
    public static void display(int []a)
    {
        for (int n:a) System.out.println(n);
    }
    public static void sort(int[]a)
    {
        for (int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>-1 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
}
