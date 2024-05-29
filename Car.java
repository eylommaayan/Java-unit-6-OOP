// דוגמא לשימוש בבאני 

public class Car {
    private  String make;
    private double price;
    private int year;
    private String color;

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



    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
