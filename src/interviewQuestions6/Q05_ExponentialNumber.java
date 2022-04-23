package interviewQuestions6;

import java.util.Scanner;

public class Q05_ExponentialNumber {

    public static void main(String[] args) {
        //Get 2 numbers from the user.
        //first number base
        //second number Top
        //Write a code that calculates the prime of a number.
        // 2, 3 --> 2^3 = 2*2*2= 8

        // 4, 3 --> 4^3= 4*4*4 = 64

        Scanner scan= new Scanner(System.in);

        int num1= scan.nextInt();
        int num2= scan.nextInt();

        System.out.println((int)(Math.pow(num1,num2)));


        SayınınKuvvetiniBulma(num1,num2);
    }

    private static void SayınınKuvvetiniBulma(int num1, int num2) {
        int sonuc=1;

        for (int i = 0; i <num2 ; i++) {

            sonuc*=num1;



        }
        System.out.println("num1 = " + sonuc);
    }
}
