public class Main {
    public static void main(String[] args) {
       Car nissan = new Car();
       nissan.make = "Nissan";
       nissan.price = 10000;
       nissan.year = 2020;
       nissan.color = "Green";

       System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
       ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
   
    }

    
}