package interviewQuestions5;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {

    public static void main(String[] args) {
        //Get String from user and print just vowels(aeiou) inside String on the console

        System.out.println("Lütfen bir cümle giriniz");

        Scanner scan=new Scanner(System.in);

        String input=scan.nextLine();

        String[] input1= input.split("");

        for (int i = 0; i <input1.length ; i++) {

            if(input1[i].equals("a")||input1[i].equals("e")||input1[i].equals("i")||input1[i].equals("o")||input1[i].equals("u")){
                System.out.print(input1[i]);
            }

        }
    }
}
