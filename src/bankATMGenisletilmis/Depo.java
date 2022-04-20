package bankATMGenisletilmis;

import java.util.Scanner;

public class Depo {

    String kartNumarasi= "12345";
   static int sifre=11111;
   static int yeniSifre=0;

    static int bakiye=1000;
   static Scanner scan=new Scanner(System.in);

    Depo() {}

    public Depo(int x) {

        if (x == 1) {
            System.out.println(bakiye);

            devamEtmek();
        }

        if (x == 2) {
            System.out.println("Lütfen çekmek istediğiniz miktarı belirtiniz.");

            int cekilenMiktar = scan.nextInt();

            bakiye = bakiye - cekilenMiktar;

            devamEtmek();
        }

        if (x == 2) {
            System.out.println("Lütfen çekmek istediğiniz miktarı belirtiniz.");

            int cekilenMiktar = scan.nextInt();

            if (cekilenMiktar < bakiye) {

                bakiye = bakiye - cekilenMiktar;

                devamEtmek();
            }
        }
        if (x == 3) {
            System.out.println("Lütfen hesabınıza yatırmak istediğiniz miktarı belirtiniz.");

            int yatirilanMiktar = scan.nextInt();

            bakiye = bakiye + yatirilanMiktar;

            devamEtmek();}

        if (x == 4) {

            int gonderilecekMiktar=paraGonderme();

            bakiye=bakiye-gonderilecekMiktar;

            devamEtmek();
        }

        if(x==5){yeniSifre=sifreDegistirme();

            devamEtmek();}

        if(x==6){cıkıs();}












    }

    public void devamEtmek() {

        System.out.println("Devam etmek istiyorsanız 1'e çıkış için 2'e basınız.");

        int devam=scan.nextInt();
        int devamTer=0;

        if(devam==2){cıkıs();}

        else if(devam==1){

            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz\n1.Bakiye sorgula\n2.para çekme\n3.para yatirma \n 4.para gönderme \n5. sifre değiştirme\n 6. cikis");
            devamTer=scan.nextInt();

            new Depo(devamTer);
        }
    }

    private void cıkıs() {

        System.out.println("Hoşçakalın.");

        System.out.println("bakiyeniz = " + bakiye);
    }

    private int sifreDegistirme() {

        System.out.println("Lütfen şifreinizi giriniz.");

        int sifreOnay=scan.nextInt();
        int yeniSifre=0;

        if(sifreOnay==sifre){
            System.out.println("Lütfen yeni sifreyi giriniz.");

            sifre=yeniSifre=scan.nextInt();

        } return yeniSifre;
    }

    public int paraGonderme() {

        System.out.println("Lütfen para gondermek istediğiniz ibanı giriniz.");

        String iban = scan.next();

        int paraGon = 0;
        if (iban.startsWith("TR") && iban.length() == 26) {

            System.out.println("Lütfen gondermek istediğiniz miktarı giriniz.");

            paraGon = scan.nextInt();
        } else if(paraGon>bakiye){
            System.out.println("Hatali miktar girdiniz. Lütfen işleminizi yeniden yapınız.");

            paraGonderme();
        } {
            System.out.println("Hatalı iban girdiniz.");

            paraGonderme();
        }
        return paraGon;
    }


}
