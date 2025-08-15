package Acess_Modifier.protected_t;

public class index1 {
    public static void main(String[] args) {
        index i = new index();
        System.out.println("Hello, " + i.name); // Accessible in same package - public access modifier
        System.out.println("Email: " + i.mail); // Accessible in same package - protected access modifier
    }
}
