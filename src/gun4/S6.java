package gun4;

import java.util.Scanner;

public class S6 {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan= new Scanner(System.in);
        int sayi=0;
        int sonuc=0;
        int deneme= 0;
        int sayac=0;
        do
        {
            deneme= scan.nextInt();

            sonuc= sayi>deneme? sayi:deneme;
            sayac++;
        }while (sayac<5);
        System.out.println(sonuc);

    }
}
