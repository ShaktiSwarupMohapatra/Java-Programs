package Interface;
interface Iter //can have static constents and abstract methods only
 {
     int i=100; //static by default
     void m1(); //public abstract
     void m2(); //public abstract
     default void defaultmethod()
     {
         System.out.println("Im a default method commonn for all my implementation");
     }
     static void staticmethod()
     {
         System.out.println("Im a static method for information");
     }
 }
  abstract class B implements Iter // have 2 parent(Object and iter)(multiple inheritance)//class B extends Object implement Iter
        {

            @Override
            public void m1() {
                System.out.println("M1() implemented in class B");
            }

//            @Override
//            public void m2() { //incase we dont implement any 1 method of iter then we have to make this B as abstract and creat next sub class and implement there.....
//                System.out.println("M2() implemented in class B");
//            }
            public void m3() //SM
            {
                System.out.println("M3() is a specific method ");
            }
        }
class C extends B {
    @Override
    public void m2() {
        System.out.println("M2() implemented in class C");
    }
    public void m4()
    {
        System.out.println("HI AM M4()");
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        Iter it= new C(); //UC
        it.m1();
        it.m2();


        it.defaultmethod();
        Iter.staticmethod();

//        ((B)it).m3();
        ((C)it).m4();
        System.out.println(Iter.i);

    }

}
