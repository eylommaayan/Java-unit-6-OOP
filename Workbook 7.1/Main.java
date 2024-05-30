/***
 * נתרגל יצרית מקור person
 * ושימוש במקור בשביל להדפיס נתונים על דמות בקובץ הראשי
 */


import java.util.Arrays;

public class Main {
 
  public static void main(String[] args) {
      Person person = new Person();
      person.name = "Eylon Maayan";
      person.nationality = "Israely";
      person.dateOfBirth = "12/6/1990";
      person.passport = new String[] {person.name ,person.nationality, person.dateOfBirth};
      person.seatNumber = 7;

      System.out.println(person.name);
      System.out.println(person.nationality);
      System.out.println(Arrays.toString(person.passport));
      System.out.println(person.dateOfBirth);
      System.err.println(person.seatNumber);
  }  
    
}
