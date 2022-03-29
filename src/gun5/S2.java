package gun5;

import java.util.Scanner;

public class S2 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

        double urunAdedi=15;
        double listeFiyat=10;

        System.out.println("Müşteri kartiniz var mi? \n evet için 1'e basın. \n hayır için 2'e basın.");
        Scanner scan= new Scanner(System.in);
        int secim= scan.nextInt();
        int sayac=0;

        switch (secim)

        {
            case 1: do { listeFiyat=8.5;
                sayac++;

            }while (urunAdedi<=10 && sayac==1); if(urunAdedi>10){ listeFiyat=8.0;} break;

            case 2: do { listeFiyat=9.0;
                sayac++;

            }while (urunAdedi<=10 && sayac==1); if(urunAdedi>10){ listeFiyat=8.5;} break;




        } System.out.println("listeFiyat = " + listeFiyat);

    }
}
