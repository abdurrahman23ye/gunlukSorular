package interviewQuestions1;

import java.util.ArrayList;
import java.util.List;

public class S1 {

    public static void main(String[] args) {
        /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

        String input="alacan";
        int sayac=0;

        String[] input1= input.split("");
        List<String> list=new ArrayList<>();

        for (int i = 0; i <input1.length ; i++) {

            for (int j = 0; j <input1.length ; j++) {



                if(input1[i].equals(input1[j])&& !list.contains(input1[j])) {sayac++;





                    System.out.println(input1[i]+" "+sayac);}



            }list.add(input1[i]);

        sayac=0;    }


        }
    }

