package aHocaDay2;

import java.util.Scanner;

public class S8 {

    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan= new Scanner(System.in);

        String kelime1= scan.next();
        String kelime2= scan.next();

        System.out.println(kelime1.concat(kelime2));
        System.out.println(kelime1.substring(1)+kelime2.substring(1));




    }
}
