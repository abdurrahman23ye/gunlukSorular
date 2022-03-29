package gun2;

import java.util.Scanner;

public class S5 {

    public static void main(String[] args) {

        /*Kullanicidan toplamak icin sayi isteyin ve toplam 500’e ulasincaya kadar devam
istemeyi ettirin. Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi
girildigini yazdirin

         */

       Scanner scan= new Scanner(System.in);

       int input= 0;
       int toplam=0;
       int sayac=0;

       do {

           input= scan.nextInt(); sayac++;

           toplam += input;

       }while (toplam<=500);
        System.out.println("sayac = " + sayac);
        System.out.println("toplam = " + toplam);
    }

}
