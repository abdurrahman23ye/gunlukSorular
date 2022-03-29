package hHocaArr;

import java.util.Arrays;

public class S7 {

    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 8
         */
        int[][]input ={{1,2,-3},{41,55},{-61,-17,80}};

        int enBuyukElement= enBuyukElementiBul(input);


        System.out.println(enBuyukElement);

    }

    private static int enBuyukElementiBul(int[][] input) {

        Integer enKucukDeger= Integer.MIN_VALUE;

        int enBuyukElement=0;



        for (int i = 0; i <input.length ; i++) {

            for (int j = 0; j <input[i].length ; j++) {

                if(input[i][j]>enKucukDeger){enBuyukElement=input[i][j];}
            }

        }


        return enBuyukElement;
    }
}
