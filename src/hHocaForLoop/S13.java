package hHocaForLoop;

public class S13 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        String input="Java ogrenmek cok guzel.";
        int sayac=0;

        String[] input1=input.split("");

        for (int i = 0; i <input1.length ; i++) {

            if(input1[i].equals("e")){sayac++;}

        }
        System.out.println("sayac = " + sayac);
    }
}
