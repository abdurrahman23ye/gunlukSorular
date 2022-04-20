package interviewQuestions5;

public class Q06_CountsOfRepeatingElement {
    public static void main(String[] args) {

         /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */

        int arr [] = {1,1,1,22,23,85,58,77,66,22,23,77};

        int givenNumber=1;

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]==givenNumber){sayac++;}



        } System.out.println("sayac = " + sayac);
    }
}
