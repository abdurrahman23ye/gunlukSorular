package _15_Exceptions;

import java.util.Scanner;

public class Task1 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {



   /* 'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
    int v = vize
    int f = final

    Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
    Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
    Diğer durumlarda ise,
    vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
    vizeye 120, finale 80 girin.

    Programın çalışmasını sağlayın. (handle edin)

    */


      double ortalama=  ortalama();

        System.out.println("ortalama = " + ortalama);
    }

    private static double ortalama() {


        double vize=0.0;
        double finalNotu=0.0;
        double ortalama=0.0;

        double vizeKontrol=0.0;
        double finalKontrol=0.0;


        System.out.println("Lütfen vize notunuzu giriniz.");
            vize=scan.nextDouble(); vizeKontrol= vizeKontrol(vize);

        System.out.println("Lütfen final notunuzu notunuzu giriniz.");
        finalNotu=scan.nextDouble();finalKontrol= finalKontrol(finalNotu);




        ortalama=finalKontrol*60/100+vizeKontrol*40/100;
    return ortalama;
}

    private static double vizeKontrol(double vize) {

        try {
            vize=vize;
            if(vize<0 || 100<vize){throw new ArithmeticException("Vize 100'den büyük,0'dan küçük olamaz.");}
        } catch (ArithmeticException e) {
            System.out.println("Vize 100'den büyük,0'dan küçük olamaz.");
            System.out.println("Tekrar deneyiniz.");
            vize=scan.nextDouble(); vizeKontrol(vize);
        }
    return vize;}

    private static double finalKontrol(double finalNotu) {

        try {
            finalNotu=finalNotu;
            if(finalNotu<0 || 100<finalNotu){throw new ArithmeticException("Final notu 100'den büyük,0'dan küçük olamaz.");}
        } catch (ArithmeticException e) {
            System.out.println("Final notu 100'den büyük,0'dan küçük olamaz.");
            System.out.println("Tekrar deneyiniz.");
            finalNotu=scan.nextDouble(); finalKontrol(finalNotu);
        }
        return finalNotu;}


    }
