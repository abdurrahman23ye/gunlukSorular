package interviewQuestions6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q02_AtbashCode {
    public static void main(String[] args) {
        /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */


        String alfabe="abcdefghijklmnopqrstuvwxyz";

        StringBuilder terstenAlfabe=new StringBuilder(alfabe);
        terstenAlfabe=terstenAlfabe.reverse();

        System.out.println("terstenAlfabe = " + terstenAlfabe);

        String input="vhizhvmrxlp";

        String[] input1=alfabe.split("");

        for (int i = 0; i <input.length() ; i++) {
            for (int j = 0; j <input1.length ; j++) {

               if(input.substring(i,i+1).equals(input1[j])){

                   System.out.print(terstenAlfabe.charAt(j));
               }


            }


        }

    }
}
