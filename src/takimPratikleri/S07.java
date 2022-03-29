package takimPratikleri;

import java.util.Scanner;

public class S07 {

    public static void main(String[] args) {


        //    Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

        Scanner scan= new Scanner(System.in);

        String kelime= scan.next();  // kelimeyi istedim.

        int sonIndex= kelime.length()-1; // sadece for döngüsünün başında son index olacak.

        for(;sonIndex>=0;sonIndex--){             //sonIndex sıfırlanana kadar ve for döngüsünün başında bir atama olsada olur olmasa da

            String terstenKelime =""+ kelime.substring(sonIndex, sonIndex+1);

            System.out.print(terstenKelime);
        }
    }
}
