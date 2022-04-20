package interviewQuestions1;

public class S5_ForFlashBack {
    public static void main(String[] args) {
        /*
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

        String input="Java ogrenmek cok guzel";
        String aranacakKelime="e";

        String[] input1=input.split("");
        int sayac=0;

        for (int i = 0; i <input1.length ; i++) {

            if(input1[i].equals(aranacakKelime)){sayac++;}

        }
        System.out.println("sayac = " + sayac);
    }
}
