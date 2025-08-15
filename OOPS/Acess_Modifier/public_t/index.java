package Acess_Modifier.public_t;

public class index {
    public String name="Pratyush";
    public static void main(String[] args) {
        System.out.println("Hello, " + new index().name);//Acessible in same class 
    }
}
class index_sub extends index{
    public void display() {
        System.out.println("Hello, " + name); // Accessible in subclass
    }
}

