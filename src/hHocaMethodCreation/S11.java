package hHocaMethodCreation;

import java.util.Scanner;

public class S11 {

   static Scanner scan=new Scanner(System.in);
   static int baslangicBakiyesi=1000;


    public static void main(String[] args) {

         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */




      //giris
      //devam
      //bakiye
      //para yatırma
      //para çekme
      //çıkış

        giris(baslangicBakiyesi);
        devamEt(baslangicBakiyesi);
        bakiyeSorma(baslangicBakiyesi);
        paracekme(baslangicBakiyesi);
        parayatırma(baslangicBakiyesi);
        cikis(baslangicBakiyesi);
    }

    private static void parayatırma(int baslangicBakiyesi) {

        System.out.println("Yatırmak istediğiniz miktarı belirtiniz");

        int paraYatirma= scan.nextInt();

        baslangicBakiyesi=baslangicBakiyesi+paraYatirma;
        System.out.println("Bakiyeniz = " + baslangicBakiyesi);
        devamEt(baslangicBakiyesi);


    }

    private static void paracekme(int baslangicBakiyesi) {

        System.out.println("Çekmek istediğiniz miktarı belirtiniz");

        int paracekme= scan.nextInt();

        baslangicBakiyesi=baslangicBakiyesi-paracekme;
        System.out.println("Bakiyeniz = " + baslangicBakiyesi);
        devamEt(baslangicBakiyesi);
    }

    private static void bakiyeSorma(int baslangicBakiyesi) {

        System.out.println("Bakiyeniz = " + baslangicBakiyesi);
        devamEt(baslangicBakiyesi);
    }

    private static void devamEt(int baslangicBakiyesi) {

        System.out.println("Devam etmek için 1'e çıkmak için 2'e basiniz.");

        int tercih2=scan.nextInt();
        if(tercih2==1){giris(baslangicBakiyesi);}
        if(tercih2==2){cikis(baslangicBakiyesi);}

    }

    private static void cikis(int baslangicBakiyesi) {

        System.out.println("Hoşçakalin");

        System.out.println("Son bakiyeniz:"+baslangicBakiyesi);
    }

    private static void giris(int baslangicBakiyesi) {

        System.out.println("Lütfen yapmak istediğiniz işlemi yazınız\n1.Bakiye sorma\n2.Para yatırma\n3.Para Çekme\n4.Çıkış");

        int tercih1=scan.nextInt();

        if(tercih1==1){bakiyeSorma(baslangicBakiyesi);}
        if(tercih1==2){parayatırma(baslangicBakiyesi);}
        if(tercih1==3){paracekme(baslangicBakiyesi);}
        if(tercih1==4){cikis(baslangicBakiyesi);}
    }

}
