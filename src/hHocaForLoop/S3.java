package hHocaForLoop;

public class S3 {

    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */
        String input="Bugün hava oldukaca güzel.";

        String[] input1=input.split("");

        int sayac=0;

        for (int i = 0; i <input1.length ; i++) {

            if(input1[i].contains("c")||input1[i].contains("c")) break;

            if(input1[i].contains("a")|| input1[i].contains("A")){sayac++;}



        }
        System.out.println("sayac = " + sayac);


    }
}
