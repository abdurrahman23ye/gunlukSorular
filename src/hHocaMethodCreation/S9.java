package hHocaMethodCreation;

import java.util.Scanner;

public class S9 {

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        /*
    TASK :
    addDigits isminde bir method create ediniz.
    Parametresi int
    Return tipi de int
    Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
    Tek basamaklı çıktığında, return etsin

    Örnek1:
    Girdi 38
    Çıktı: 2
    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamaklı olduğundan, bunu döndürün.
    */



        addDigits();
    }

    private static void addDigits() {

        System.out.println("Lütfen bir sayi giriniz");

        int input=scan.nextInt();
        int basamakToplami= basamakTopla(input);

        if(basamakToplami %2!=1){addDigits();}

        System.out.println("basamakToplami = " + basamakToplami);


    }

    private static int basamakTopla(int input) {


       int basamakToplami=0;

       while(input>0) {

           basamakToplami += input%10;
           input = input/10;

       }

       if(basamakToplami>9){basamakToplami=basamakTopla(basamakToplami);}


   return basamakToplami; }
}
