package practice_free1;

import java.util.Scanner;

public class S4 {
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */

        System.out.println("Donusturmek istediğiniz cm değerini giriniz.");

        double cm=scan.nextDouble();

      double sonuc=  degerCevirme(cm);

        System.out.println("sonuc = " + sonuc);
    }

    private static double degerCevirme(double cm) {
        System.out.println("Donusturmek istediğiniz değeri belirtiniz(Metre ya da Kilometre)");
        String tercih= scan.next();
        double sonuc=0;

        if(tercih.equalsIgnoreCase("metre")){sonuc=cm/100;}
        if(tercih.equalsIgnoreCase("kilometre")){sonuc=cm/100000;}


    return sonuc;}
}
