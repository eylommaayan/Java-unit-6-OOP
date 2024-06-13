public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

    // Constructor
    public Car(String make, double price, int year, String color) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    // Copy constructor
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
}







// import java.util.Arrays;


// public class Car {
//     private String make;   // סוג הרכב
//     private double price;  // מחיר הרכב
//     private int year;      // שנת ייצור הרכב
//     private String color;  // צבע הרכב
//     private String[] spareParts; // חלקי חילוף

//     // קונסטרקטור ראשי לאתחול כל המשתנים
//     public Car(String make, double price, int year, String color, String[] spareParts) {
//         this.make = make;
//         this.price = price;
//         this.year = year;
//         this.color = color;
//         this.spareParts = Arrays.copyOf(spareParts, spareParts.length); // יצירת עותק כדי לשמור על אי-שינוי חיצוני
//     }

// }

//

//     // גטרים וסטרים עבור כל המאפיינים
//     public String getMake() {
//         return this.make;
//     }

//     public void setMake(String make) {
//         this.make = make;
//     }

//     public double getPrice() {
//         return this.price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     public int getYear() {
//         return this.year;
//     }

//     public void setYear(int year) {
//         this.year = year;
//     }

//     public String getColor() {
//         return this.color;
//     }

//     public void setColor(String color) {
//         this.color = color;
//     }

//     public String[] getSpareParts() {
//         return Arrays.copyOf(this.spareParts, this.spareParts.length); // החזרת עותק כדי לשמור על אי-שינוי חיצוני
//     }

//     public void setSpareParts(String[] spareParts) {
//         this.spareParts = Arrays.copyOf(spareParts, spareParts.length); // יצירת עותק כדי לשמור על אי-שינוי חיצוני
//     }

//     // פונקציה להדפסת פרטי הרכב
//     public void display() {
//         System.out.println("\nCar Details:");
//         System.out.println("Make: " + this.make);
//         System.out.println("Price: " + this.price);
//         System.out.println("Year: " + this.year);
//         System.out.println("Color: " + this.color);
//         System.out.println("Spare Parts: " + String.join(", ", this.spareParts));
//     }

//     // פונקציה להדפסת הודעת נהיגה
//     public void drive() {
//         System.out.println("\nYou bought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + ".");
//         System.out.println("It comes with the following spare parts: " + String.join(", ", this.spareParts));
//         System.out.println("Please drive your car to the nearest exit.\n");
//     }
// }
