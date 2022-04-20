package practice_free1;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

        Scanner scan=new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi giriniz.");

        char islem=scan.next().charAt(0);

        System.out.println("Lütfen işlemdeki sıraya göre iki sayi giriniz.");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        switch (islem){

            case '+':
                System.out.println("sayi1+sayi2 = "+ (sayi1+ sayi2)); break;
            case '-':
                System.out.println("sayi1-sayi2 = "+ (sayi1- sayi2)); break;
            case '*':
                System.out.println("sayi1+sayi2 = "+ (sayi1*sayi2)); break;
            case '/':
                System.out.println("sayi1+sayi2 = "+ (sayi1/ sayi2)); break;

            default:
                System.out.println("Hatalı işlem seçtiniz.Lütfen yapmak istediğiniz işlemi seçiniz(+,-,*,/)");
        }
    }
}
