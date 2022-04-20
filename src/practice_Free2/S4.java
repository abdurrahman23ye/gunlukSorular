package practice_Free2;

public class S4 {

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

        String kullanicidanAldigimiVarsaydigimCumle=" Java ogrenmek cok guzel.";
        String kullanicidanAldigimiVarsaydigimHarf="e";

        String[] input=kullanicidanAldigimiVarsaydigimCumle.split("");

        int sayac=0;

        for (int i = 0; i < input.length ; i++) {

            if(input[i].equals("e"))sayac++;}

        System.out.println("sayac = " + sayac);

    }
}
