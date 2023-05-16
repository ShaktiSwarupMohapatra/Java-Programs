package BasicJava2;

public class VariableArguments {
    public static void m1(int...arg)
    {
        int sum=0;
        for (int i=0;i<arg.length;i++)
        {
            if(arg.length==1)
            {
                sum=arg[i]+arg[i];
            }
            else
            {
                System.out.println(arg[i]);
                sum = sum + arg[i];
            }
        }
        System.out.println("The total is :"+sum);
    }

    public static void main(String[] args) {
        m1(7);
    }
}
