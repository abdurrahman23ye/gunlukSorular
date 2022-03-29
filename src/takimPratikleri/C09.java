package takimPratikleri;

import java.util.Scanner;

public class C09<kelime> {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String kelime1= scan.next();

        int sonIndex= kelime1.length()-1;

        int baslangic= 0;

        String tersKelime="";

        for(;sonIndex>=0; sonIndex--) {

            tersKelime +=kelime1.charAt(sonIndex);


        }

        System.out.println(tersKelime);

        if (kelime1.equals(tersKelime)){
            System.out.println("Bu bir p'li şeydir");
        }else {
            System.out.println("bu o p'li şey değil");
        }
    }
}
