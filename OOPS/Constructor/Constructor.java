package Constructor;
class Student{
    int id;
    String name;
    int age;
    String course;
    double fee;
    Student(){//default Constructor
    id=1;
    }
    Student(int id, String name, int age, String course, double fee){//parameterized Constructor
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;
        this.fee=fee;
    }
    Student(Student s){//copy contsructor
        this.id=s.id;
        this.name=s.name;
        this.age=s.age; 
        this.course=s.course;
        this.fee=s.fee;
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
        System.out.println("Fee: "+fee);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(2,"Pratyush",20,"Java",2000.00);
        s2.display();
        Student s3=new Student(s2);//s2 is passed to copy constructor
        s3.display();
    }
}
