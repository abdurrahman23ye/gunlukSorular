package hHocaProje;

import java.util.Random;

public class RandomNumberBetweenTwoNumbers {

    public static void main(String[] args) {

    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

     */

    /*
    İki tane pozitif integer sayısı verildiğinde

    sayı 1 min degerinde

    sayı 2 max degerinde

    min ve max arasinda random sayi elde et(olustur)

    output veri tipi int olmali
     */

        Random rand= new Random();

        int sayi1=10;
        int sayi2=20;

        int buyuk=sayi1>sayi2? sayi1:sayi2;
        int kucuk=sayi1<sayi2? sayi1:sayi2;




        int rastgele= rand.nextInt(buyuk);

        //while ile if koşulları sağlanana kadar tekrar istenebilir ama sorular sorunun bu olduğundan şüpheliyim o yüzden devam etmedim.

        for (int i = kucuk; i <=buyuk ; i++) {

           if(rastgele>kucuk && rastgele<buyuk){


           }
            
        } System.out.println(rastgele);
    }
}
