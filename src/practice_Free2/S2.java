package practice_Free2;

import hHocaList.AsalSayi;

import java.util.Scanner;

public class S2 {

    public static void main(String[] args) {
        /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

        System.out.println("Lütfen pozitif bir sayı giriniz.");

        Scanner scan= new Scanner(System.in);

        int input= scan.nextInt();
        boolean asalMi=true;

        for (int i = 2; i <input ; i++) {

            if(input %i==0){asalMi=false;}

        }
        System.out.println("asalMi = " + asalMi);
    }
}
