public class Main {

    public static void main(String[] args) {
        String[] spareParts = new String[] {"Tires", "Keys"};

        // יצירת אובייקט Car עם פרטי רכב מסוג Nissan
        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);

        // יצירת אובייקט Car עם פרטי רכב מסוג Dodge
        Car dodge = new Car("Dodge", 11000, 2019, "Blue", spareParts);

        // הדפסת פרטי הרכב Dodge
        dodge.display();

        // יצירת אובייקט חדש על בסיס אובייקט קיים של Nissan ושינוי הצבע שלו
        Car nissan2 = new Car(nissan);
        nissan2.setColor("Yellow");

        // קריאה לפונקציה drive להדפסת הודעת נהיגה
        nissan2.drive();
    }
}
