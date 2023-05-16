package Student;
class Student {
    int id;
    String name;
    String gender;
    int age;
    String PhoneNo;
    static String CollageName;
    static String CollageAdress;

    public void addStudent(int id, String name, String gender, int age, String PhoneNo) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.PhoneNo = PhoneNo;
    }
    public void display()
    {
        System.out.println("Student ID : "+id);
        System.out.println("Student Name : "+name);
        System.out.println("Student Gender : "+gender);
        System.out.println("Student Age : "+age);
        System.out.println("Student PhoneNo : "+PhoneNo);
        System.out.println("Student College Name : "+CollageName);
        System.out.println("Student College Address : "+CollageAdress);
        System.out.println("-------------------------------------------------");
    }
    public void changeCollageName(String CollageName,String CollageAdress)
    {
        Student.CollageName=CollageName;
        Student.CollageAdress=CollageAdress;
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        Student.CollageName="JSP";
        Student.CollageAdress="OAR";
        Student s1=new Student();
        s1.addStudent(01,"Shakti","Male",24,"9348110349");
        s1.display();
        Student s2=new Student();
        s2.addStudent(02,"Rani","Female",23,"9090575965");
        s2.display();
        Student s3=new Student();
        s3.changeCollageName("QSP","BTM");
        s3.addStudent(03,"Priya","Female",24,"9348110349");
        s3.display();

    }
}
