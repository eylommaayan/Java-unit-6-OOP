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

    // getters -  בשביל להשתמש במשתנים הפרטיים 

    public  String getMake(){
        return make;
    }

    public double getPrice(){
        return price;
    }

    public  int getYear(){
        return  year;
    }

    public String getColor(){
        return  color;
    }
}
