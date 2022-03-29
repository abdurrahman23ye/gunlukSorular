package takimPratikleri;

import java.util.Scanner;

public class S08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kelime = scan.next();

        String tersKelime = tersKelimeBul(kelime);

        System.out.println(tersKelime);
    }


    private static String tersKelimeBul(String kelime) {


        int sonIndex = kelime.length() - 1; // sadece for döngüsünün başında son index olacak.

        String terstenKelime = "";
        for (; sonIndex >= 0; sonIndex--) {             //sonIndex sıfırlanana kadar

            terstenKelime += "" + kelime.substring(sonIndex, sonIndex + 1);




        }
        return terstenKelime;
    }
}