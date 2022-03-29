package aHocaDay4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S13 {

    public static void main(String[] args) {


        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        Scanner scan= new Scanner(System.in);

        int kullanicidanAlinacakDeger= scan.nextInt();

        int [] input = {1,2,3,4,5,6,7,8};

        Arrays.sort(input);

        for (int i = input.length-kullanicidanAlinacakDeger; i < input.length ; i++) {

            System.out.print(input[i]+" ");



        }


    }
}
