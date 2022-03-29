package hHocaProje;

import java.util.Arrays;
import java.util.Scanner;

public class CountE {

    public static void main(String[] args) {
        /*    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0


     input: bucket
            b:1
        output should be 1
        */


        //hint: .charAt, length(), for, index, counter,



    /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     input: Test output
            b: 0
        output 0 olmalı


     input: bucket
            b:1
        output 1 olmalı
        */


        //hint: .charAt, length(), for, index, counter,

        Scanner scan=new Scanner(System.in);

        String input= scan.nextLine().toLowerCase();


        String[] arr=input.split("");

        int sayac=0;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <input.length() ; i++) {

            if(arr[i].equals("b")){sayac++;}

        }
        System.out.println(sayac);

    }
}
