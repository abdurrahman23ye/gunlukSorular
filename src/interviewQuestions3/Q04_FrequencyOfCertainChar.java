package interviewQuestions3;

public class Q04_FrequencyOfCertainChar {
    public static void main(String[] args) {

         /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */

        String name="sevecen";

        char aranan='e';


        int sayac=0;

        for (int i = 0; i <name.length() ; i++) {

            if(name.charAt(i)==(aranan)){sayac++;}

        }
        System.out.println("sayac = " + sayac);

    }
}
