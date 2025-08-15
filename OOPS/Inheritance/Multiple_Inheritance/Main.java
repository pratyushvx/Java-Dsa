// Base class
class Restaurant {
    String name;
    String location;

    void open() {
        System.out.println(name + " at " + location + " is now open.");
    }
}

// Intermediate class inheriting Restaurant
class Menu extends Restaurant {
    String[] dishes;

    void showMenu() {
        System.out.println("Menu at " + name + ":");
        for (String dish : dishes) {
            System.out.println("- " + dish);
        }
    }
}

// Derived class inheriting Menu
class SpecialMenu extends Menu {
    String specialDish;

    void showSpecial() {
        System.out.println("Today's special at " + name + ": " + specialDish);
    }
}

public class Main {
    public static void main(String[] args) {
        SpecialMenu sm = new SpecialMenu();
        sm.name = "Ocean's Delight";
        sm.location = "Beachside";
        sm.dishes = new String[]{"Grilled Salmon", "Caesar Salad", "Clam Chowder"};
        sm.specialDish = "Lobster Thermidor";

        sm.open();         // from Restaurant
        sm.showMenu();     // from Menu
        sm.showSpecial();  // from SpecialMenu
    }
}
