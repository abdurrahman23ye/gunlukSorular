package arrSorularıDers;

import java.util.Arrays;

public class S5 {

    public static void main(String[] args) {
        // Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        String input="Scanner'dan aldığımı varsaydığım kelime.";

        //String[] arr = new String[input.split(" ").length]; // String in uzunluğu konusunda şüphesi olan varsa gerek yok.

       String arr[]= input.split(" ");


        System.out.println(Arrays.toString(arr));
    }
}
