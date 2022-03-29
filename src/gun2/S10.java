package gun2;

public class S10 {
    public static void main(String[] args) {
       /* Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd

        */

        String input="aabbcccccddddaaa";

        int sonIndex= input.length()-1;

        String sonuc="";

        for (int i = 0; i <=sonIndex ; i++) {

           if( input.substring(i+1).contains(input.substring(i,i+1))){}

             else { sonuc +=input.substring(i,i+1);}
           }

        System.out.println(sonuc);

        }

    }

