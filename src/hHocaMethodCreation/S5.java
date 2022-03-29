package hHocaMethodCreation;

import java.util.Arrays;

public class S5 {

    public static void main(String[] args) {
          /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

        String input="deneme için kullanılacak girdi";

        kelimeSaydirma(input);
    }

    private static void kelimeSaydirma(String input) {

        String[] input1=input.split(" ");



        System.out.println("Girdinizin kelime sayısı:"+input1.length);
    }
}
