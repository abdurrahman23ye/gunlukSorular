package interviewQuestions6;

import java.util.ArrayList;
import java.util.List;

public class Q01_FrequencyOfGivenCharacters {
    public static void main(String[] args) {
        /*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */

        String input="AAABBCDD";

        String[] input2=input.split("");
        List<String> liste=new ArrayList<>();
        int sayac=0;

        for (int i = 0; i <input2.length ; i++) {
            sayac=0;
            if(!liste.contains(input2[i])){
            for (int j = 0; j <input2.length ; j++) {
                if(input2[i].equals(input2[j])){sayac++;}

            }liste.add(input2[i]);

            System.out.print( input2[i]+sayac);}}


    }
}
