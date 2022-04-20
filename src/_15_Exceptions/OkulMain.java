package _15_Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulMain {

    /* 1- fieldları ad, soyad, yas olan bir Ogrenci pojo class'ı create ediniz.

        2- fieldları okulAd, maxOgrenciSayisi,
ArrayList cinsinden Öğrencileri olan bir Okul pojo class create ediniz,

 3- main metodunun olduğu OkulMain isimli bir class create ediniz.

        4- bir okul obj create edip, bu okula max öğrenci miktarına ulaşana kadar öğrenci
ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.

     */
    static Scanner scan = new Scanner(System.in);
   static List<Ogrenci> ogrenciListesi = new ArrayList<>();
   static boolean flag=true;//



    public static void main(String[] args) {

        okulUretme();






    }

    public static void okulUretme() {
        System.out.println("Okul adini giriniz.");
        String okulAdi = scan.next();
        System.out.println("Okul kapasitesini giriniz.");
         int maxOgrenciSayisi = scan.nextInt(); //task'te olmadığı için try catch calışılmadı.

        Okul yeniOkul = new Okul(okulAdi, maxOgrenciSayisi);


        ogrenciUretme(maxOgrenciSayisi);
    }


    private static void ogrenciUretme(int maxOgrenciSayisi) {



        String isim = "";
        String soyAd = "";
        int yas = 0;
        while (true){

        System.out.println("Öğrencinin adını giriniz");
        isim = scan.next();
        System.out.println("Öğrencinin soyadını giriniz");
        soyAd = scan.next();
        System.out.println("Öğrencinin yaşını giriniz");
        try {
            yas = scan.nextInt();

            if (yas > 15 || yas < 0) {
                throw new IllegalAccessException("Yas 15'ten büyük olamaz. Başka bir öğrenci giriniz");
            } else break;
        } catch (IllegalAccessException e) {
            System.out.println("Yas 15'ten büyük olamaz. Tekrar deneyiniz.Başka bir öğrenci giriniz");
        }


    } Ogrenci yeniOgrenci = new Ogrenci(isim, soyAd, yas);

        ogrenciListesi.add(yeniOgrenci);



        try {



            if(ogrenciListesi.size()> maxOgrenciSayisi){throw new IllegalArgumentException("Yer kalmadi");}
        } catch (IllegalArgumentException e) {
            System.out.println("Okulumuzun öğrenci kapasitesi doldu. Yeni kayıt alınamadı");

            sonlandir();

            flag=false;


        }
        while(flag){



            System.out.println("Başka öğrenci eklemek istermisiniz? Evet için 1'e hayır için 2' basın.");

            int tercih = scan.nextInt();////task'te olmadığı için try catch calışılmadı.

            switch (tercih) {

                case 1:
                    ogrenciUretme(maxOgrenciSayisi);
                    break;
                case 2:
                    System.out.println("Hoşçakalın");
                    break;
            }}


        }

    private static void sonlandir() {

        System.out.println("Yeni kayit için alan açılırsa biz sizi haberdar ederiz.");

    }
}
