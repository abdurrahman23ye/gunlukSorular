package hHocaArr;

import java.util.Arrays;

public class S10 {

    public static void main(String[] args) {

          /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */


        String str="GayetBasarılı";
        String str2="CoookBasarılı";

        String[] str3=str.split("");
        String[] str4=str2.split("");;

        System.out.println(Arrays.toString(str3));

        str3=str4;
        System.out.println(Arrays.toString(str3));




    }
}
