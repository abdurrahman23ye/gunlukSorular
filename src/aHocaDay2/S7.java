package aHocaDay2;

import java.util.Scanner;

public class S7 {

    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin


        Scanner scan=new Scanner (System.in);

        String isim= scan.next().toUpperCase();
        String soyIsim= scan.next().toUpperCase();

        System.out.println(isim+" "+soyIsim);
    }
}
