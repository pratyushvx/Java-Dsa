package Acess_Modifier.default_t;

public class index1 {
    public static void main(String[] args) {
    index i =new index();
        System.out.println("Hello, " + i.name); // Accessible in same package
        System.out.println("Passcode: " + i.passcode); // Accessible in same package        
    }
}
