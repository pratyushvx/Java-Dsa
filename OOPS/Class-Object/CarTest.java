class Car {
    String color;
    String model;
    int year;
    double price;

    public void getCarDetails() {
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Color: " + this.color);
        System.out.println("Car Year: " + this.year);
        System.out.println("Car Price: $" + this.price);
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota Camry";
        myCar.year = 2020;
        myCar.price = 24000.00;

        Car myCar2 = new Car();
        myCar2.color = "Blue";
        myCar2.model = "Honda Accord";
        myCar2.year = 2021;
        myCar2.price = 26000.00;

        myCar2.getCarDetails();
        myCar.getCarDetails();
    }
}
