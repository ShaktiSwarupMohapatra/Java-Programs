package Overriding01;
class Human
{
    String name;
    int age;
    String gender;
    String color;

    public Human(String name, int age, String gender, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;

    }

//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                ", color='" + color + '\'' +
//                '}';
//    }
}
class Doctor extends Human
{
    String specialist;

    public Doctor(String name, int age, String gender, String color, String specialist)
    {
        super(name, age, gender, color);
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                "specialist='" + specialist + '\'' +
                '}';
    }
}
public class HumanTest {
    public static void main(String[] args) {
        Doctor d= new Doctor("Suresh",55,"Male","Mid","Cardio");
        System.out.println(d);
    }
}
