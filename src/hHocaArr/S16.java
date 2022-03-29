package hHocaArr;

import static java.lang.Character.isDigit;

public class S16 {

    public static void main(String[] args) {
         /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        //Hocanın ipucu ile çözemedim.
        String input = "ade1r4d3";


        int toplam = cumledekiRakamToplamı(input);

        System.out.println(toplam);

    }

    private static int cumledekiRakamToplamı(String input) {


            String[] input1=input.split("");


            int toplam=0;

            for (int i = 0; i <input1.length ; i++) {


                if(Character.isDigit(input1[i].charAt(0))){

                    toplam+=Integer.valueOf(input1[i]);
                }

            }


            return toplam;





    }
}

