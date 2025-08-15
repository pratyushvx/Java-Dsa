package Inheritance.Hierarchial_Inheritance;

// Parent class
class FoodItem {
    String name;
    double price;

    void display() {
        System.out.println("Food Item: " + name);
        System.out.println("Price: $" + price);
    }
}

// Child class 1
class Beverage extends FoodItem {
    boolean isCold;

    void serve() {
        String temp = isCold ? "cold" : "hot";
        System.out.println("Serving " + temp + " " + name);
    }
}

// Child class 2
class Dessert extends FoodItem {
    int calories;

    void showCalories() {
        System.out.println(name + " contains " + calories + " calories.");
    }
}

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Beverage();
        coffee.name = "Coffee";
        coffee.price = 3.5;
        coffee.isCold = false;
     
        Dessert cake = new Dessert();
        cake.name = "Chocolate Cake";
        cake.price = 5.0;
        cake.calories = 450;

        coffee.display();
        coffee.serve();

        System.out.println();

        cake.display();
        cake.showCalories();
    }
}

