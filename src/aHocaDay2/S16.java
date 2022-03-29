package aHocaDay2;

public class S16 {

    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.


                String input="Java ogrenmek123 Cok guzel@";

                input=input.replaceAll("\\d","");
                input=input.replace("@","").replace("C","c").trim();

        System.out.println("input = " + "\""+(input)+"\"");



    }
}
