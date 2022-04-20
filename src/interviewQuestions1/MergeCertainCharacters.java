package interviewQuestions1;

public class MergeCertainCharacters {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */
        
        String input="ahmet";
        int input1=5;
        
      String sonuc=  ilkSon(input,input1);

        System.out.println("sonuc = " + sonuc);
    }

    private static String ilkSon(String input, int input1) {

        String result="";



        for (int i = 0; i <input1 ; i++) {

            result+=input.substring(0,1)+input.substring(input.length()-1);

        }

   return result; }
}
