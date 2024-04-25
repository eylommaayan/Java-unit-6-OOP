// דוגמא לשימוש בבאני 

public class Car {
    String make;
    double price;
    int year;
    String color;

    //עם המשתנים של הבאני this קישור המשתנים הנוחכים
    public Car(String make,
     double price, 
     int Year,
      String color){
        this.make = make;
        this.price = price;
        this.year = Year;
        this.color = color;
    }
}
