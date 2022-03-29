package hHocaList;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S9 {

    public static void main(String[] args) {
        /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

        Scanner scan=new Scanner(System.in);

        String input=scan.nextLine();

        String[] arr=input.split("");

        int max=0;
        int sayac=0;
        String enFazlaTekrarEden="";

        for (int i = 0; i <input.length() ; i++) {
            for (int j = i; j <input.length() ; j++) {

                if(arr[i].equals(arr[j])){

                 sayac++;
                }

                if(sayac>=max){

                    max=sayac;

                    enFazlaTekrarEden=arr[i];
                }

            } sayac=0;

        }
        System.out.println("enFazlaTekrarEden = " + enFazlaTekrarEden);
        System.out.println(max);


        sayac=0;



    }
}
