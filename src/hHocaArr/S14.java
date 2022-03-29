package hHocaArr;

import java.util.Arrays;

public class S14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */

        String input= "Congratulations";

        String[] input2= input.split("");

        for (int i = 0; i <input2.length ; i++) {

            if (input2[i].equals("o")||input2[i].equals("a")|| input2[i].equals("u")){input2[i]="i";}

        }
        System.out.println(Arrays.toString(input2));
    }
}
