package Rectangle;
class Rectangle2 {
    int length;
    int breath;

    public Rectangle2(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public Rectangle2(int num) {
        this(num,num);
    }

    public void display() {
        System.out.println("Length Of The Rectangle is: " + length);
        System.out.println("Breath Of The Rectangle is: " + breath);
    }

    public void area() {
        int area = length * breath;
        System.out.println("The area of the Rectangle is : " + area);
    }
}
public class Rectangle_C_This {
    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2(24, 54);
        r1.display();
        r1.area();
        Rectangle2 r2 = new Rectangle2(10);
        r2.display();
        r2.area();
    }
}