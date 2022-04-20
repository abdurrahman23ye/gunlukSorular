package interviewQuestions5;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {

    public static void main(String[] args) {

         /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
    */

        Scanner scan=new Scanner(System.in);

        int sayi=0;

        System.out.println("Lütfen bir sayı giriniz.");

        do {
            sayi= scan.nextInt();

            if(sayi<100){
                System.out.println("Won.Repeat");

            }
        }while (sayi<100);
        System.out.println("Lost");

    }
}
