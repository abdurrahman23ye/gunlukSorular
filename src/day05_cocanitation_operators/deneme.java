package day05_cocanitation_operators;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

    //    Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

        Scanner scan= new Scanner(System.in);

        String kelime= scan.next();  // kelimeyi istedim.

        int sonIndex= kelime.length()-1; // sadece for döngüsünün başında son index olacak.

        for(;sonIndex>=0;sonIndex--){             //sonIndex sıfırlanana kadar

            String terstenKelime =""+ kelime.substring(sonIndex, sonIndex+1);

            System.out.print(terstenKelime);
        }















        }


    }

