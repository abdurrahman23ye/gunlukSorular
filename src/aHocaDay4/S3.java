package aHocaDay4;

import java.util.Arrays;

public class S3 {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String input= "HeySiri";
        String input2= "ByeSiri";

        String [] arr= input.split("");
        String [] arr2= input2.split("");

        arr=arr2;

        System.out.println(Arrays.toString(arr));

    }
}
