package Acess_Modifier.private_t;

public class index1 {
    public static void main(String[] args) {
        index emp = new index();
        System.out.println("=== Same Package (Different Class) ===");
        System.out.println("Name: " + emp.employeeName); // ✅ public
        System.out.println("Salary: " + emp.salary);     // ✅ protected
        System.out.println("Department: " + emp.department); // ✅ default
        // System.out.println("Password: " + emp.password); // ❌ private not accessible
    }
}
