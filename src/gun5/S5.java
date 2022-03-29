package gun5;

public class S5 {

    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        String input="Bugün aaahava oldukca güzel.";

        int baslangic=0;
        int sayac=0;

        for (int i = baslangic; i < input.length()-1; i++) {

            if (input.charAt(i)=='c') {break;} else if (input.charAt(i)=='a'){
                sayac++;
            }

        }
        System.out.println(sayac);
    }
}
