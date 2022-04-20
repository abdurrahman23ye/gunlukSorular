package practice_free1;

public class S7 {

    public static void main(String[] args) {


        /*
		Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called reverseString
		  */

        String input="deneme";



        String tersInput=  terstenYazdirma(input);

        System.out.println("tersInput = " + tersInput);


    }

    private static String terstenYazdirma(String input) {

        String tersInput="";

        String[] input2= input.split("");

        for (int i = input2.length-1; i>=0 ; i--) {

            tersInput+=input2[i];



        }
   return tersInput; }
}
