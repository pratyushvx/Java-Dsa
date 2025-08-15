package Acess_Modifier.other;
import Acess_Modifier.private_t.index;

public class other_private {
    public static void main(String[] args) {
        index emp = new index();
        System.out.println("=== Different Package (No Inheritance) ===");
        System.out.println("Name: " + emp.employeeName); // ✅ public
        // System.out.println("Salary: " + emp.salary);     // ❌ protected
        // System.out.println("Department: " + emp.department); // ❌ default
        // System.out.println("Password: " + emp.password);     // ❌ private
    }
}

class other_sub extends index {
    public static void main(String[] args) {
        other_sub emp = new other_sub();
        System.out.println("=== Different Package (With Inheritance) ===");
        System.out.println("Name: " + emp.employeeName); // ✅ public
        System.out.println("Salary: " + emp.salary);     // ✅ protected via inheritance
        // System.out.println("Department: " + emp.department); // ❌ default
        // System.out.println("Password: " + emp.password);     // ❌ private
    }
}
