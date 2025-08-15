// Parent class
class Restaurant {
    String name;
    String location;

    void open() {
        System.out.println(name + " at " + location + " is now open.");
    }
}

// Child class
class Menu extends Restaurant {
    String[] dishes;

    void showMenu() {
        System.out.println("Menu at " + name + ":");
        for (String dish : dishes) {
            System.out.println("- " + dish);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Menu myMenu = new Menu();
        myMenu.name = "Spice House";
        myMenu.location = "Downtown";
        myMenu.dishes = new String[]{"Pasta", "Grilled Chicken", "Salad"};

        myMenu.open();      // inherited method
        myMenu.showMenu();  // child method
    }
}
