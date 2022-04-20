package interviewQuestions3;

public class Q02_Palindrome {
    public static void main(String[] args) {
         /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */

        String input="madama";

        palindromMu(input);


    }

    private static void palindromMu(String input) {

        String[] input1=input.split("");
        boolean palindromMu=true;

        for (int i = 0; i <input1.length ; i++) {

            if(!input1[i].equals(input1[input1.length-1-i])){palindromMu=false;}



        }System.out.println(input+" palindromMu = " + palindromMu);
    }
}
