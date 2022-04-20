package aHocaDay6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class S9 {

    public static void main(String[] args) {
        // Baska ülke veya bolgelerin saat dilimine gore zamani alma
        // Newyork un saat dilimine gore saat ?


        LocalDateTime date=LocalDateTime.now(java.time.ZoneId.of("America/New_York"));

        System.out.println("date = " + date);
    }
}
