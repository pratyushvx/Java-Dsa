package Easy.restaurent;

public class Dish {
    public String name;
    public double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void display() {
        System.out.println("Dish: " + name);
        System.out.println("Price: $" + price);
    }
}
