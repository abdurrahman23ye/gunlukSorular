package takimPratikleri;


import java.util.Random;
import java.util.Scanner;

public class C11 {

    public static void main(String[] args) {

        Random rastgele = new Random(); //kendiliğinden util random import etmiyor biz manuel yapıyoruz

        int rastgelesayi = rastgele.nextInt(100); // parantezin içinde bir sınır belirleyerek işlemin çok uzamasını engellemeye çalıştım.

        Scanner scan = new Scanner(System.in);

        System.out.println(rastgelesayi); //kontrol amaçlı rasgele sayıya bakıyorum.


        int sayac = 0;

        int deneme =0 ;
        while (deneme != rastgelesayi) {      //eşitlik üzerine döngü kurarsak ilk denemede başarısız olursa döngü çalışmayacak.
            sayac += 1;                       // kaç deneme yapıyoruz?
            deneme = scan.nextInt();

            if (deneme > rastgelesayi) {
                System.out.println("daha küçük bir sayı deneyiniz");
            } else if (deneme < rastgelesayi) {
                System.out.println("daha büyük bir sayı deneyiniz");
            }

        }

        System.out.println(sayac);
    }

}
