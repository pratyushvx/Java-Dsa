package Acess_Modifier.other;
import Acess_Modifier.public_t.index;
public class other_public {
  public static void main(String[] args) {
    index i=new index();
    System.out.println("Hello, " + i.name); // Accessible in another package through public access modifier
  }
    
}
class other_sub extends index {
    public void display() {
        System.out.println("Hello, " + name); // Accessible in subclass even in another package
    }
}