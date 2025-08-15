package Acess_Modifier.other;
import Acess_Modifier.protected_t.index;

public class other_protected {
    public static void main(String[] args) {
        index i = new index();
        System.out.println("Hello, " + i.name); // Accessible in same package - public access modifier
        //System.out.println("Email: " + i.mail); // Not accessible here - protected access modifier is not visible outside the package
    }
}
class other_sub extends index {
    public void display() {
        System.out.println("Hello, " + name); // Accessible in subclass even in another package
        System.out.println("Email: " + mail); // *** Accessible using Inheritance in subclass ***
    }
    // in static main the value are acessed which are static so create object of subclass
    public static void main(String[] args) {
        index i = new index();
       // System.out.println("Hello, " + i.mail); // This is not acessible 
        //you access it through a reference of the superclass type.
        other_sub os = new other_sub();
        os.display();
        System.out.println(os.mail); // Accessible in subclass even in another package
    }
}