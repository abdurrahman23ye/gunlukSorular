package practice_Free2;

import java.util.Scanner;

public class S1 {
    static Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */



        String input=scan.next();

        String sonuc=  ilkSonKarakterDondurme(input);

        System.out.println("sonuc = " + sonuc);

    }

    private static String ilkSonKarakterDondurme(String input) {

        System.out.println("İlk ve son karakterlerin kaç defa yazdırılmasını isteriniz?");

        int tercih=scan.nextInt();

        String sonuc="";
        int sayac=0;

        do {
            sonuc+=input.substring(0,1)+input.substring(input.length()-1);
            sayac++;
        }while (sayac!=tercih);

    return sonuc;}
}
