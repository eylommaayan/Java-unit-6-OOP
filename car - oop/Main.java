public class Main {
    public static void main(String[] args) {
        // Creating a Car object with details for a Nissan car
        Car nissan = new Car("Nissan", 10000, 2020, "Green");

        // Creating a copy of the Nissan car using the copy constructor
        Car nissan2 = new Car(nissan);

        // Modifying the color of the copied car
        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        // Creating a Car object with details for a Dodge car
        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        // Using getters to print details of the cars
        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
    }
}