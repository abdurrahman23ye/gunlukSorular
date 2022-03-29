package aHocaDay4;

import java.util.Arrays;

public class S10 {

    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        String input="ahmet okula git.";

        input= input.replaceAll("\\s","");


        System.out.println("input = " + input);

        String[] karakterSayisi= input.split("");

        System.out.println(karakterSayisi.length);
    }
}
