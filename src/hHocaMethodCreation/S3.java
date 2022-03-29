package hHocaMethodCreation;

import java.util.Scanner;

public class S3 {

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        /*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */


        double sonuc= degerCevirme();

        System.out.println("sonuc = " + sonuc); //sonuca birim ekleme çalışılabilir.
    }

    private static double degerCevirme() {
    double sonuc=0;

        System.out.println("Hangi deger birimini dönüştürmek istiyorsunuz?(Yazarak bildiriniz.)");

        String secim= scan.next();


        if(secim.equalsIgnoreCase("saat")) {

            System.out.println("Donüştürmek istediğiniz saat miktarını giriniz");

            double saat1= scan.nextDouble();


            sonuc= saat1*60*60;



        }

        else if(secim.equalsIgnoreCase("mil")) {

            System.out.println("Donüştürmek istediğiniz mil miktarını giriniz");

            double mil1= scan.nextDouble();


            sonuc= mil1/1.6;

        }

       else if(secim.equalsIgnoreCase("kilogram")) {

            System.out.println("Donüştürmek istediğiniz kilogram miktarını giriniz");

            double kilogram1= scan.nextDouble();


            sonuc= kilogram1*1000;

        }

       //Hatalı girişler çalışılabilir.




    return sonuc;}
}
