package interviewQuestions5;

import java.util.Scanner;

public class Q03_CountFactors {
    public static void main(String[] args) {
         /*
        Type java code by using while loop,
       Write a ram to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4prog
*/
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen çarpan sayısını öğrenmek istediğiniz sayıyı giriniz.");

        int input= scan.nextInt();

        carpanlariniBul(input);
    }

    private static void carpanlariniBul(int input) {
        int sayac=0;

        for (int i = 1; i <=input ; i++) {

            if(input%i==0){sayac++;}



        }System.out.println(input+"un pozitif tam çarpan sayısı = "+ sayac );
        System.out.println(input+"un pozitif toplam çarpan sayısı = "+ (sayac*2));
    }
}
