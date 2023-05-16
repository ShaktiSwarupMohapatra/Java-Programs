//instance of is a key word with return type as boolean type.
//used to chk wheather the object is belongs to that class or not
//inheritance (IS-A) relationship is mandiatory
package Type_Casting;
class A3{

}
class B3 extends A3{

}
public class Instance_of {
    public static void main(String[] args) {
        Object obj=new Object(); // creating object of object class
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof A3);
        System.out.println(obj instanceof B3);

        A3 a= new A3();
        System.out.println(a instanceof Object);
        System.out.println(a instanceof A3);
        System.out.println(a instanceof B3);

        B3 b= new B3();
        System.out.println(b instanceof Object);
        System.out.println(b instanceof A3);
        System.out.println(b instanceof B3);

        A3 a2 = new B3(); // upcasting
        System.out.println(a2 instanceof Object);
        System.out.println(a2 instanceof A3);
        System.out.println(a2 instanceof B3);


    }
}
