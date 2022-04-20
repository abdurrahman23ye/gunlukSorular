package aHocaDay6;

import java.time.LocalDate;
import java.time.Period;

public class S8 {

    public static void main(String[] args) {
        // Bugunun tarihi aliniz, yazdiriniz...
        // Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
        // Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..

        LocalDate date= LocalDate.now();

       date= date.plusDays(1);
       date= date.plusYears(1);
       date= date.plusMonths(1);
       date= date.minusDays(3);
       date= date.minusMonths(2);
       date= date.minusYears(5);

        System.out.println("date = " + date);
    }
}
