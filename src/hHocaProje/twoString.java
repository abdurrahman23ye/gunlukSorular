package hHocaProje;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */


        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .

        Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

       Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"

         */

        String input="abc";
        String input1="cat";

       if(input.substring(input.length() - 1).equals(input1.substring(0, 1))){

           System.out.println(  input.concat(input1.substring(1)));
       }

    }
}
