package Acess_Modifier.protected_t;

public class index {
    public String name = "Pratyush";
    protected String mail="pratyushthakur7037@gmail.com";
    public static void main(String[] args) {
        index i=new index();
        System.out.println("Hello, " + i.name); // Accessible in same class - public access modifier
        System.out.println("Email: " + i.mail); // Accessible in same class - protected access modifier
    }
}
