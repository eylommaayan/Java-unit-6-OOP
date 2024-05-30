package start;

public class Main {
  public static void main(String[] args) {
      Car nissan = new Car();
      nissan.make = "Nissan";
      nissan.price = 10000;
      nissan.year = 2020;
      nissan.color = "Green";

      Car kia = new Car();
      kia.make = "KIA";
      kia.price = 12000;
      kia.year = 2019;
      kia.color = "Red";

      System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
      ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
      System.out.println("This " + kia.make + " is worth $" + kia.price + 
      ". It was built in " + kia.year + ". It is " + kia.color + ".\n");
    }
    
}
