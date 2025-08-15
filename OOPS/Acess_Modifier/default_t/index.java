package Acess_Modifier.default_t;

public class index {
    protected String name="pratyush"; // protected access modifier, accessible within the same package
    int passcode=7037; // Default access modifier, accessible within the same package
    public static void main(String[] args) {
        index obj = new index();
        System.out.println("Hello, " + obj.name); // Accessible in same class
        System.out.println("Passcode: " + obj.passcode); // Accessible in same class
    }
}
