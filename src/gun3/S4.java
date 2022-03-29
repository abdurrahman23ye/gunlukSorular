package gun3;

import java.util.Scanner;

public class S4 {

    public static void main(String[] args) {

         /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */

        Scanner scan= new Scanner(System.in);

        int taban= scan.nextInt();
        int us= scan.nextInt();
        int sonuc=1;

        for (int i = 1; i <=us ; i++) {



            sonuc *=taban;
            System.out.println(sonuc);

        }
        System.out.println(sonuc);

    }
}
