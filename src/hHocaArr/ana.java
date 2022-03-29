package hHocaArr;

import java.util.Arrays;

public class ana {

    public static void main(String[] args) {

        /*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "silent") ==> true
		 */

        String kelime1= "listan", kelime2= "simentddd";

        String[] input1= kelime1.split("");

        String[] input2= kelime2.split("");

        Arrays.sort(input1);
        Arrays.sort(input2);


        boolean anagramMmi=false;

        for (int i = 0; i < input1.length; i++) {


                if(input1[i].equals(input2[i])){anagramMmi=true;}






        } if(anagramMmi){
            System.out.println("bu bir anagramdir");
        } else{
            System.out.println("bu bir anagram değildir");
        }




    }
}
