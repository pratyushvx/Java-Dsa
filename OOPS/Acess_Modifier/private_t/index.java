package Acess_Modifier.private_t;

public class index {
    public String employeeName = "John Doe";       // public
    protected double salary = 75000.50;            // protected
    String department = "Engineering";             // default
    private String password = "secure@123";         // private

    public static void main(String[] args) {
        index emp = new index();
        System.out.println("=== Inside Same Class ===");
        System.out.println("Name: " + emp.employeeName);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Department: " + emp.department);
        System.out.println("Password: " + emp.password); // ✅ private works here
    }
}
