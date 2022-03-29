package gun2;



import java.util.Scanner;

public class S4 {

    public static void main(String[] args) {

        /* /* Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol

edin ve sifredeki hatalari yazdirin.
Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
girdiginde “Sifreniz Kabul edilmistir” yazdirin.

- Sifre kucuk harf icermelidir
- Sifre buyuk harf icermelidir
- Sifre ozel karakter icermelidir
- Sifre en az 8 karakter olmalidir.


         */

        Scanner scan = new Scanner(System.in);

        String sifre = scan.next();
        int sonIndex = sifre.length() - 1;
        boolean kucukHarfKontrol=true;
        boolean buyukHarfKontrol=true;

        do {
            kucukHarfKontrol = sifre.charAt(sonIndex) >= 'a' && sifre.charAt(sonIndex) <= 'z';

            if (kucukHarfKontrol == true) {
                 break;}

                sonIndex--;

        }while (sonIndex !=0); if(kucukHarfKontrol==false) {System.out.println("Şifrede küçük harf olmalı.");}

        do {
            buyukHarfKontrol = sifre.charAt(sonIndex) >= 'A' && sifre.charAt(sonIndex) <= 'Z';

            if (buyukHarfKontrol == true) {
                 break;}

            sonIndex--;

        }while (sonIndex !=0);if(buyukHarfKontrol==false) { System.out.println("Şifrede büyük harf olmalı.");}

        boolean uzunlukKontrol= sifre.length()>=8; if(uzunlukKontrol=false){
            System.out.println("Şifre en az 8 karakter olmalıdır.");
        }

        String ozelKarakterKontrol= sifre.replaceAll("\\d","");
        ozelKarakterKontrol= sifre.replaceAll("\\w","");

        boolean ozelKarakterKontrol1=true;

        if(ozelKarakterKontrol.isEmpty()){ozelKarakterKontrol1=false;}

        if(ozelKarakterKontrol1=false){
            System.out.println("Şifrede özel karakter bulunmalı.");
        }

        if(ozelKarakterKontrol1 && buyukHarfKontrol && kucukHarfKontrol && uzunlukKontrol){
            System.out.println("şifre geçerli");
        } else{
            System.out.println("tekrar deneyiniz");
        }



    }
}