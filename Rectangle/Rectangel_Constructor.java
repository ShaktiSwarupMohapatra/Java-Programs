package Rectangle;
class Rectangle
{
    int length;
    int breath;
    public Rectangle(int length,int breath)
    {
        this.length=length;
        this.breath=breath;
    }
    public Rectangle(int length)
    {
        this.length=length;
        breath=length;
    }
    public void display()
    {
        System.out.println("Length Of The Rectangle is: "+length);
        System.out.println("Breath Of The Rectangle is: "+breath);
    }
    public void area()
    {
        int area=length*breath;
        System.out.println("The area of the Rectangle is : "+area);
    }
}
public class Rectangel_Constructor {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(24,54);
        r1.display();
        r1.area();
        Rectangle r2= new Rectangle(10);
        r2.display();
        r2.area();
    }
}
