package aHocaDay4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class S11 {

    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        List<String> kullaniciListesi = new ArrayList<>();


        Random rnd = new Random();

        int baslangic = 0;
        int rastgele = rnd.nextInt(10);

        Scanner scan = new Scanner(System.in);

        int listeUzunlugu = scan.nextInt();

        while (baslangic < listeUzunlugu) {

            rastgele = rnd.nextInt(20);

            kullaniciListesi.add(baslangic, "yusuf" + rastgele);

            baslangic++;
        }


        System.out.println("kullaniciListesi = " + kullaniciListesi);

        String kullaniciAdi = scan.next();

        if(!kullaniciListesi.contains(kullaniciAdi)){

            kullaniciListesi.add(listeUzunlugu,kullaniciAdi);


        }


        for (int i = 0; i <kullaniciListesi.size() ; i++) {

            if(kullaniciListesi.get(i).equals(kullaniciAdi))

            { kullaniciListesi.add(listeUzunlugu,kullaniciAdi+rastgele);
                break;

            }

        }System.out.println(kullaniciListesi.get(listeUzunlugu));

    }

}