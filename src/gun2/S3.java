package gun2;

import java.util.Scanner;

public class S3 {

    public static void main(String[] args) {
        /*Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini

soyleyin.
Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi
giremezsiniz” yazdirip basa donun
Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi
girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

         */
        Scanner scan= new Scanner(System.in);
        int input=0;
        int toplam=0;
        int sayac=0;
        int sayac1=0;
        do {

            input= scan.nextInt();

            if(input>0){ toplam+=input;

            sayac++;}

            if(input<0){
                System.out.println("Negatif sayı giremezsiniz");
                sayac1++;
            }

        }while (input !=0);

        System.out.println("Girdiğiniz POZİTİF sayıların toplamı:"+toplam);
        System.out.println("girdiğiniz pozitif sayı miktarı:"+sayac);
        System.out.println("girdiğiniz negatif sayı miktarı:"+sayac1);
    }
}
