package Acess_Modifier.other;
import Acess_Modifier.default_t.index;
public class other_default {
    public static void main(String[] args) {
        index i = new index();
        System.out.println("Other Default called nothing acessible ");
        //System.out.println("Hello, " + i.name); // Not Accessible in diff package - protected access modifier
        //System.out.println("Passcode: " + i.passcode); // Not Accessible in diff package - default access modifier  
    }
    
}
class other_default2 extends index {
    public void display() {
        System.out.println("Hello, " + name); // *** Accessible using Inheritance in subclass ***
        //System.out.println("Email: " + passcode); // Not Accessible in diff package - default access modifier
    }
    // i
    public static void main(String[] args) {
        //index i = new index();  you access it through a reference of the superclass type.
        //System.out.println("Hello, " + i.name); // Not Accessible in diff package - protected access modifier
        //System.out.println("Passcode: " + i.passcode); // Not Accessible in diff package - default access modifier  
        other_default2 od = new other_default2();
        System.out.println(od.name);//This is Protected can acessed in subclass
        //System.out.println(od.passcode); // This is default can not be accessed in subclass
        od.display(); // This will call the display method of the subclass
    }
}