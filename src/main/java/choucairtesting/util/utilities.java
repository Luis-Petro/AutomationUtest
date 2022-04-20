package choucairtesting.util;

import java.util.Random;

public class utilities {

    public static int RamdomNumber() {
        Random random = new Random();

        int value = random.nextInt(999 + 100) + 100;
        return value;
    }

//Parameters i= 1(day), 2(Month), 3(Year); Date = "day-Month-Year"
    public static String ParseDate(int i, String Date){

        String dateParts[] = Date.split("-");

        String day   = dateParts[0];
        String month = dateParts[1];
        String year  = dateParts[2];

        switch (i){
            case 1: return day;
            case 2: return month;
            case 3: return  year;

            default: return "";
        }
    }
}
