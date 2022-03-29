package gun5;

import java.util.Arrays;
import java.util.Scanner;

public class S6 {

    public static void main(String[] args) {
        // kullaniciya kac elementlik bir array olusturacagini sorun
// array'i olusturup elementleri kullanicidan alip, array'e atayin.

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen kaç elementli bir array istediğinizi yazınız");

        int uzunluk=scan.nextInt();



        int arr[]=new int[uzunluk];

        int sayac=0;
        int i=0;

        do{



            arr[i]=scan.nextInt();

            i++;
            sayac++;
        }

        while (i<uzunluk);

        System.out.println(Arrays.toString(arr));
    }
}
