package gun1;

import java.util.Scanner;

public class S1 {

    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
yapmadigini farz edin.
         */
        Scanner scan = new Scanner(System.in);

        char baslangicDegeri = scan.next().toUpperCase().charAt(0);
        char bitisDegeri = scan.next().toUpperCase().charAt(0); //kullanıcının yapabileceği hataları dikkate almadım.


        while (baslangicDegeri <= bitisDegeri) {

            System.out.print(baslangicDegeri);
            if (baslangicDegeri == bitisDegeri) {
            } else {
                System.out.print(",");
            }

            baslangicDegeri++;
        }
    }

}
