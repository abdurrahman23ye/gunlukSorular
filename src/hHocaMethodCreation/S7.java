package hHocaMethodCreation;

public class S7 {

    public static void main(String[] args) {
         /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */

        String input = "Java'yı Seviyorum.";

       String terstenInput= kelimeyiTersineCevirme(input);

        System.out.println("terstenInput = " + terstenInput);
    }

    private static String kelimeyiTersineCevirme(String input) {

        String terstenInput="";
        String[] arr=input.split("");

        for (int i = arr.length-1; i>=0 ; i--) {

            terstenInput+=arr[i];

        }
    return terstenInput;}
}
